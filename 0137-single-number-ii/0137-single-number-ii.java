// class Solution {
//     public int singleNumber(int[] nums) {
        
        

//         Map<Integer, Integer> map = new HashMap<>();

//         for(int num : nums){
//             map.put(num, map.getOrDefault(num, 0)+1);

//         }
//          for(Map.Entry<Integer, Integer> entry : map.entrySet()){

//             if(entry.getValue() == 1){
//                 return entry.getKey();
//             }
        
//          }
//              return -1;

    
// }}
          
class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;

        for(int i = 0;i < 32; i++){
            int sum = 0;
            for(int num : nums){
                if((num>>i & 1) == 1){
                    sum++;
                }
            }
            if(sum%3 != 0){
                result  = result | 1<<i;
            }

        }
        return result;

    }
}


