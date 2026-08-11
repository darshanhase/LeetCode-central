class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        int mini = Integer.MAX_VALUE;
        for(int i:nums){
            if(i < 0) continue;
            set.add(i); 
            mini = Math.min(mini,i);
        }

        if( mini > 1){
            return 1;
        }

        while(set.contains(mini)){
            mini++;
        }

        return mini;
    }
}