class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        // First pass: count character frequencies
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Second pass: find first unique character
        for(int i = 0; i < n; i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        // Return -1 if no unique character exists
        return -1;
    }
}   