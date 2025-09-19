class Solution {
    public int maximum69Number (int num) {
        // Convert the number to a mutable character array
        char[] digits = String.valueOf(num).toCharArray();
        
        // Find the first '6' and change it to '9'
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // Only change the first one
            }
        }
        
        // Convert back to integer
        return Integer.parseInt(new String(digits));
    }
}