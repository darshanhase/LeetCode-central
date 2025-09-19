class Solution {
    public boolean isPowerOfTwo(int n) {
        
    
    if(n <= 0 ){                                        
        return false;
    }
    boolean ans = (n & (n-1)) == 0;
    return ans;

    
//     int count = 0;
// while(n > 0){
//      if((n & 1) ==1){
//         count++;
//     }
//     n = n>>1;
   

// }

// if(count == 1)return true;
// else return false;

} }
