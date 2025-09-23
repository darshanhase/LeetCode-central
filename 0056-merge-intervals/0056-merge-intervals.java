class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <= 1) return intervals;


        // sorting array based on first starting time of iinterval 
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0] , b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for(int i = 1; i < intervals.length; i ++){
            int[] next = intervals[i];
            if(current[current.length-1] >= next[0]){

                current[current.length-1] = Math.max(current[current.length-1],next[next.length-1]);
            
            }else{
                result.add(current);
                current = next;
            }



        } 
        
        
        //after for  looop there is still one element is remaining from intervals
        result.add(current);

        return  result.toArray(new int[result.size()][]); 

    }
}