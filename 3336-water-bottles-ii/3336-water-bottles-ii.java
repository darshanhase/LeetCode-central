class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty = empty - numExchange; // Use up empty bottles
            totalDrank++; // Drink the new bottle
            empty++; // It becomes empty again
            numExchange++; // Exchange gets harder
        }
        return totalDrank;

    }
}