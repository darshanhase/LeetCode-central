class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char[][] result = new char[n][m];

        for (int i = 0; i < m; i++) {
            char[] currentRow = boxGrid[i];
            int writePos = n - 1;

            char[] simulatedRow = new char[n];

            // Fill with empty cells
            for (int k = 0; k < n; k++) {
                simulatedRow[k] = '.';
            }

            // Simulate gravity
            for (int j = n - 1; j >= 0; j--) {
                if (currentRow[j] == '*') {
                    simulatedRow[j] = '*';
                    writePos = j - 1;
                } 
                else if (currentRow[j] == '#') {
                    simulatedRow[writePos] = '#';
                    writePos--;
                }
            }

            // Rotate 90 degrees clockwise
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = simulatedRow[j];
            }
        }

        return result;
    }
}