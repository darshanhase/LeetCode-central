class Solution {
    public int findMaxLength(int[] nums) {
        int  n = nums.length;
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> diffIndex = new HashMap<>();
        for(int i = 0; i < n; i++){

            if(nums[i]==0) zero++;
            else one++;
            int diff = zero - one;
            if(diff == 0){
                res = Math.max(res,i+1);
                continue;
            }

            if(!diffIndex.containsKey(diff)){
               diffIndex.put(diff, i);
            }
            else{

                int index = diffIndex.get(diff);
                int len = i - index;
                res = Math.max(res,len);
            }

            
        }

return res;
    }
}