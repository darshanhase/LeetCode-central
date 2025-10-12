class Solution {

    //we can use char[] stack ---- char array as stack  it reduces java's overhead for stack class but it also will take O(N) 


    public boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                
            }
}
}
 return stack.isEmpty();
}
}
