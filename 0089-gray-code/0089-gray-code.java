class Solution {
    public List<Integer> grayCode(int n) {
         List<Integer> result = new ArrayList<>();
        int size = 1 << n; // total 2^n codes
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1)); // Gray code formula
        }
        return result;

    }
}