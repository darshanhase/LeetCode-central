class Solution {
    // public  void swap(int[] nums, int i ,int j ){
    //     nums[i] = nums[i]^nums[j];
    //     nums[j] = nums[i]^nums[j];
    //     nums[i] = nums[i]^nums[j];
        
    // }
    public int firstMissingPositive(int[] nums) {

        // HashSet<Integer> set=new HashSet<>();
        // int mini = Integer.MAX_VALUE;
        // for(int i:nums){
        //     if(i < 0) continue;
        //     set.add(i); 
        //     mini = Math.min(mini,i);
        // }

        // if( mini > 1){
        //     return 1;
        // }

        // while(set.contains(mini)){
        //     mini++;
        // }

        // return mini;


        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}  