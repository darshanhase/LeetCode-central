class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
            int n = image.length;
        
        for (int[] row : image) {
            int left = 0, right = n - 1;
            
            while (left <= right) {
                                                 // swap and invert
                int temp = row[left] ^ 1;        // invert left
                row[left] = row[right] ^ 1;      // invert right
                row[right] = temp;               // assign inverted left to right
                
                left++;
                right--;
            }
        }
        
        return image;
    }
}