class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
       int sum = 0;
       Map<Integer,Integer> prefixSumFreq = new HashMap<>();
       prefixSumFreq.put(0, 1);

       for(int num : nums){
        sum += num;

        count = count + prefixSumFreq.getOrDefault(sum - k, 0);
       prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
       }
        
    return count;
    }
}