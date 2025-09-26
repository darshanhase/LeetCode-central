class Solution {
    public int triangleNumber(int[] nums) {
      Arrays.sort(nums); 
        int n = nums.length ;
        int count = 0 ;
       for (int k = n -1 ;k>=2;k--){
        int right = k - 1,left = 0 ;
        int target = nums[k];
        while (left< right){
            if (nums[right]+nums[left]>target){
                count += (right-left) ;
                right -- ;
            }else{
                left ++ ;
            }
        }
       }
       return count ;
    }
}