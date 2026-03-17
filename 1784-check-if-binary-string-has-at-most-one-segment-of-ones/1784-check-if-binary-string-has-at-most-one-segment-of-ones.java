class Solution {
    public boolean checkOnesSegment(String s) {
        // If "01" exists in the string, it means
        // there is a segment of 1s followed by 0s,
        // and later another segment of 1s.
        return !s.contains("01");
    }
}