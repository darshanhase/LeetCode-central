class Solution {
    public int maximumLengthSubstring(String s) {
        // Map <Character,Integer> map = new HashMap<>() ; 
        // int max_length = 0 ;
        // int length = 0 ; 

        // for (char str :s.toCharArray() ){
        //          map.put(str, map.getOrDefault(str , 1 )+1);
        //          if (map.get(str)  < 2 ){
                
        //         length ++ ; 
        //         max_length = Math.max(max_length , length ) ; 
        //     }
        //     else {

        //         length = 0 ; 
        //         map.put(str,0) ; 
        //     }
        // }

        // return max_length ; 
        int[] freq = new int[256];
        int len = s.length();
       int res = 0;
        int low =0;

        for(int high = 0;high < len; high++ ){
            char ch = s.charAt(high);
            int idx = ch-'a';
            freq[idx] += 1 ;

            while( freq[idx] > 2){
               
                int lowC = s.charAt(low);
               
                freq[lowC- 'a'] -= 1;
                 low++;
            }
            int diff = high -low+1;
            res = Math.max(diff , res);
        }

        return res;
     }
}