class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;  // min must be in right part
            } else {
                right = mid;     // mid could be min
            }
        }

        return nums[left];
    }
}