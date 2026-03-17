class Solution {
    public char findKthBit(int n, int k) {
        return helper(n, k);
    }
    
    private char helper(int n, int k) {
        
        if (n == 1) return '0';
        
        int length = (1 << n) - 1; // length of Sn
        int mid = (length / 2) + 1; // middle position
        
        if (k == mid) {
            return '1'; // middle is always '1'
        } else if (k < mid) {
            return helper(n - 1, k); // lies in first half
        } else {
            // lies in second half
            int mirroredPos = mid - (k - mid);
            char bit = helper(n - 1, mirroredPos);
            return bit == '0' ? '1' : '0'; // invert
        }
    }
}