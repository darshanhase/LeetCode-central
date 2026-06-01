class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans = 0;
        
        for (int i = cost.length - 1, cnt = 0; i >= 0; i--, cnt++) {
            if (cnt % 3 != 2) {
                ans += cost[i];
            }
        }
        
        return ans;
    }
}