import java.util.*;

class Solution {
    public int minimumEffort(int[][] tasks) {
        // Sort tasks by (minimum - actual) descending
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
        
        int totalActual = 0;
        int result = 0;
        
        for (int[] task : tasks) {
            totalActual += task[0];
            result = Math.max(result, totalActual + task[1] - task[0]);
        }
        
        return result;
    }
}
