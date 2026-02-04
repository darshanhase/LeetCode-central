class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> ans = new ArrayList<>();

        // mark present numbers
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            int idx = val - 1;
            if (nums[idx] > 0) nums[idx] = -nums[idx];
        }

        // collect missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) ans.add(i + 1);
        }

        return ans;
    }
}