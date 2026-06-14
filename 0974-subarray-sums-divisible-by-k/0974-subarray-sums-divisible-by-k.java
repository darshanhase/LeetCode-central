class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int size = nums.length;
        int sum = 0;
        int res =0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);

        for(int i =0;i<size;i++){
            sum+=nums[i];
            int rem = sum%k;

            if(rem<0){
                rem = rem+k;
            }

            res += freq.getOrDefault(rem, 0);
            freq.put(rem, freq.getOrDefault(rem, 0)+1);
        }


        return res ;
    }
}