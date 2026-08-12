
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            
           
                if(map.get(nums[right])>k){
                   while (map.get(nums[right]) > k) {
                         map.put(nums[left], map.get(nums[left]) - 1);
                                     left++;
                        } 
                }  

                 
                 res = Math.max(res, right - left + 1);
          
        }
          return res;
    }
    }