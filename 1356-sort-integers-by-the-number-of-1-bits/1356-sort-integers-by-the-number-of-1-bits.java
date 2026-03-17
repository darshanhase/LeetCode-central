import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert to Integer list for custom sort
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            if (bitA == bitB) {
                return a - b; // sort by value if bit counts equal
            }
            return bitA - bitB; // sort by bit count
        });
        
        // Convert back to int[]
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}