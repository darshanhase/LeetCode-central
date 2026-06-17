class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n + 1];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            long cur = len[i];

            if (c >= 'a' && c <= 'z') {
                len[i + 1] = cur + 1;
            } else if (c == '*') {
                len[i + 1] = Math.max(0L, cur - 1);
            } else if (c == '#') {
                len[i + 1] = cur * 2;
            } else { // '%'
                len[i + 1] = cur;
            }
        }

        if (k < 0 || k >= len[n]) {
            return '.';
        }

        long pos = k;

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long prevLen = len[i];

            if (c >= 'a' && c <= 'z') {
                // This character was appended at index prevLen.
                if (pos == prevLen) {
                    return c;
                }
                // Otherwise it existed before.
            } else if (c == '*') {
                // Deletion of last char: remaining positions are unchanged.
            } else if (c == '#') {
                if (prevLen > 0) {
                    pos %= prevLen;
                }
            } else { // '%'
                pos = prevLen - 1 - pos;
            }
        }

        return '.';
    }
}