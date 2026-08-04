//can use custoem class but arr[] can be optimal in this case only need to store two integers

// class Pair{
//     int first;
//     int second;

//     Pair(int first, int second){
//         this.first = first;
//         this.second  = second;

//     }

// }


class Solution {

    boolean isValid(int i, int j, int n , int m){
        if(i<0 || i>= n || j<0 || j >= m){
            return false;
        }
        return true;

    }



    public int orangesRotting(int[][] grid) {
        
    int[] x = {-1, 1, 0 ,0};
    int[] y = {0, 0, -1, 1};
 
    int n = grid.length;
    int m = grid[0].length;

    int fresh = 0;
    int time  = 0;

    Queue<int[]> q = new ArrayDeque<>();


    for(int i = 0; i< n; i ++){
        for(int j = 0; j<m ; j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j});
            }
            if(grid[i][j]==1){
                fresh++;
            }

        }
    }
    

    while(!q.isEmpty()){
        
        int s =q.size();

        while(s>0){
            int[] tmp = q.peek();
            q.poll();

            int r = tmp[0];
            int  c = tmp[1];

            for (int k = 0; k<4; k++){
                int row = r+ x[k];
                int col = c+y[k];
                
                if(isValid(row,col,n,m) && grid[row][col] == 1){
                    q.offer(new int[]{row,col});
                    grid[row][col] =-2;
                    fresh--;

                    
                }
            }
            s--;
        }
          if(!q.isEmpty())
        time++;

        
    }
    if(fresh>0){
            return -1;
            }
    
        return time;
    }
}