class Solution {
    //helper 
    public long reqHours(int[] arr,int n, int speed){

        long h = 0;
        for(int i =0; i< n ;i++){
            h =h+(arr[i]/speed);
            if(arr[i]%speed != 0){
                h++;
            }
        }

        return h;    
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();

        int res = -1;
        
        while(low<= high){

            int guess = low + (high - low)/2;
            long hour = reqHours(piles, n ,guess);

            if(hour>h){
                low = guess+1;
            }
            else{

                res = guess;
                high = guess-1;
            }


        }
        return res;
    }
}