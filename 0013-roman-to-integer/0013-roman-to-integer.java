class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500); 
        map.put('M', 1000);

        int total = 0;
        int prev = 0;

        for(int i = s.length() -1; i >=0; i--){
            int curr = map.get(s.charAt(i));

            if(curr < prev){
                total = total - curr;
                prev = curr;
            }else{
                total= total + curr;  
                prev = curr;  
            }
            

        }
        return total;
    }






//     public int romanToInt(String s) {
//     int ans = 0, num = 0;

//     for (int i = s.length() - 1; i >= 0; i--) {
//         char ch = s.charAt(i);

//         num = switch (ch) {
//             case 'I' -> 1;
//             case 'V' -> 5;
//             case 'X' -> 10;
//             case 'L' -> 50;
//             case 'C' -> 100;
//             case 'D' -> 500;
//             case 'M' -> 1000;
//             default -> 0; // fallback for safety
//         };

//         if (4 * num < ans)
//             ans -= num;
//         else
//             ans += num;
//     }

//     return ans;
// }
}