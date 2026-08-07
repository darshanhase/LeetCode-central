class Solution {

    class Pair{
        int effort;
        int row;
        int col;

        Pair(int a,int b, int c){
            this.effort = a;
            this.row =b;
            this.col = c;
        }
    }

    public boolean isValid(int r, int c, int  n, int m){
        if(r < 0 || r>=n || c < 0 || c >= m ){
            return false;
        }
        return true;

    }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] res = new  int[n][m];

        for(int[] a : res){
            Arrays.fill(a,Integer.MAX_VALUE);

        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.effort, b.effort)); 
        
        int[] x = { 1, -1, 0,0};
        int[] y = {0, 0 , -1 ,1};

        res[0][0] =0;
        pq.offer(new Pair(0 , 0 , 0));



        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int dist = p.effort;
            int row = p.row;
            int col = p.col;

            if(dist>res[row][col]){
                continue;
            }

            for(int k =0; k <4; k++){
                int r = row + x[k];
                int c = col + y[k];
                if(!isValid(r,c,n,m)){
                    continue;
                }

                int abs = Math.abs(heights[row][col]-heights[r][c]);
                int newWeight = Math.max(abs , dist);
                if(newWeight < res[r][c]){
                    res[r][c] = newWeight;
                    pq.offer(new Pair(newWeight,r,c));
                }

            }
        }

        return res[n-1][m-1];
    }
}