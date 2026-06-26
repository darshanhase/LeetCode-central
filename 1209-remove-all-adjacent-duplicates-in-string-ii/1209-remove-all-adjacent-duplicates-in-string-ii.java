record CharCount(char character, int count) {}

class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<CharCount> st = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (!st.isEmpty() && st.peek().character() == c) { // Use method()
                CharCount top = st.pop();
                int newCount = top.count() + 1; // Use method()
                
                if (newCount < k) {
                    st.push(new CharCount(c, newCount));
                }
            } else {
                st.push(new CharCount(c, 1));
            }
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            CharCount top = st.pop();
            for (int i = 0; i < top.count(); i++) { // Use method()
                res.append(top.character()); // Use method()
            }
        }
        
        return res.reverse().toString();
    }
}