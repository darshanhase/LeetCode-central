class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] heights = new int[m][n];
        
        
        for (int j = 0; j < n; j++) {
            heights[0][j] = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] == 1) {
                    heights[i][j] = heights[i-1][j] + 1;
                } else {
                    heights[i][j] = 0;
                }
            }
        }
        
        int maxArea = 0;
        
       
        for (int i = 0; i < m; i++) {
            int[] row = heights[i].clone();
            Arrays.sort(row); 
           
            for (int j = n - 1; j >= 0; j--) {
                int height = row[j];
                int width = n - j; 
                maxArea = Math.max(maxArea, height * width);
            }
        }
        
        return maxArea;
    }
}