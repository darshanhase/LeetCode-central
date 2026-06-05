class Solution {

    static class Pair {
        long cnt;
        long sum;

        Pair(long cnt, long sum) {
            this.cnt = cnt;
            this.sum = sum;
        }
    }

    private char[] digits;

    // pos, prev2, prev1, len, started
    private Pair[][][][][] memo;
    private boolean[][][][][] seen;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long n) {
        if (n <= 0) return 0;

        digits = Long.toString(n).toCharArray();

        int m = digits.length;

        memo = new Pair[m + 1][11][11][17][2];
        seen = new boolean[m + 1][11][11][17][2];

        return dfs(0, 10, 10, 0, 0, true).sum;
    }

    private Pair dfs(int pos,
                     int prev2,
                     int prev1,
                     int len,
                     int started,
                     boolean tight) {

        if (pos == digits.length) {
            return new Pair(1, 0);
        }

        if (!tight && seen[pos][prev2][prev1][len][started]) {
            return memo[pos][prev2][prev1][len][started];
        }

        int limit = tight ? digits[pos] - '0' : 9;

        long totalCnt = 0;
        long totalSum = 0;

        for (int d = 0; d <= limit; d++) {

            boolean nt = tight && (d == limit);

            if (started == 0 && d == 0) {
                Pair child = dfs(
                        pos + 1,
                        10,
                        10,
                        0,
                        0,
                        nt
                );

                totalCnt += child.cnt;
                totalSum += child.sum;
            } else {

                int add = 0;

                if (len >= 2) {
                    if ((prev1 > prev2 && prev1 > d) ||
                        (prev1 < prev2 && prev1 < d)) {
                        add = 1;
                    }
                }

                int nPrev2, nPrev1;

                if (len == 0) {
                    nPrev2 = 10;
                    nPrev1 = d;
                } else if (len == 1) {
                    nPrev2 = prev1;
                    nPrev1 = d;
                } else {
                    nPrev2 = prev1;
                    nPrev1 = d;
                }

                Pair child = dfs(
                        pos + 1,
                        nPrev2,
                        nPrev1,
                        len + 1,
                        1,
                        nt
                );

                totalCnt += child.cnt;
                totalSum += child.sum + (long) add * child.cnt;
            }
        }

        Pair res = new Pair(totalCnt, totalSum);

        if (!tight) {
            seen[pos][prev2][prev1][len][started] = true;
            memo[pos][prev2][prev1][len][started] = res;
        }

        return res;
    }
}