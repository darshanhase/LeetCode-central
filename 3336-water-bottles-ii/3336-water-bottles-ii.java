class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty = empty - numExchange; // Use up empty bottles
            totalDrank = totalDrank + 1; // Drink the new bottle
            empty = empty + 1; // It becomes empty again
            numExchange = numExchange + 1; // Exchange gets harder
        }
        return totalDrank;

    }
}