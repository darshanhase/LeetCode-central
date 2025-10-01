class Solution {
    public int lengthOfLongestSubstring(String s) {


        //  boolean[] seen = new boolean[128]; // ASCII
        // int l = 0, maxLen = 0;

        // for (int r = 0; r < s.length(); r++) {
        //     char c = s.charAt(r);
        //     while (seen[c]) {
        //         seen[s.charAt(l)] = false;
        //         l++;
        //     }
        //     seen[c] = true;
        //     maxLen = Math.max(maxLen, r - l + 1);
        // }
        // return maxLen;

      Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c)) {
                // move left pointer just after the last occurrence of c
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}