// class Solution {
//     public int numberOfSteps(int num) {

//         return helper(num , 0);
    
//     }

//     public int helper(int num, int steps){
//         if(num == 0){
//             return steps;
//         }

//         if(num % 2 == 0){
//             return helper(num/2, steps+1);
//         }

//         else{
//             return helper(num-1, steps+1);
//         }


//     }
// }




class Solution {
    public int numberOfSteps(int n) {
        int count = 0;
       while(n>0){
         if(n%2 == 0){
            n =n/2;
            count++;
         }else{
         n -=1;
         count++;
         }
        }
        System.out.println(count);
        return count; 
    }
}