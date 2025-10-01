class Solution {
    // public int numWaterBottles(int numBottles, int numExchange) {
    //       int totalDrank = numBottles;
    //     int empty = numBottles;

    //     while (empty >= numExchange) {
    //         int newBottles = empty / numExchange;
    //         totalDrank += newBottles;
    //         empty = empty % numExchange + newBottles; 
    //     }

    //     return totalDrank;
    // }
    public int numWaterBottles(int numBottles, int numExchange) {
       
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}