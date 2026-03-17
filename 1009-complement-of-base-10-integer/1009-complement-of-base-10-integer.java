class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1; // special case
        
        int mask = 0;
        int temp = n;
        
        // Build mask with all 1s up to the highest bit of n
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        
        return n ^ mask;
    }
}