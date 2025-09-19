
class Solution {
    public int minAddToMakeValid(String s) {
        
    //   int noOfunmatchedOpeningB = 0;   //for keeping Tracks of unmatched '('
    //     int noOfOeningRequiredForClosingB = 0; //for keeping Tracks of needed '(' for unmatched ')'

    //     for (char c : s.toCharArray()) {
    //         if (c == '(') {
    //            noOfunmatchedOpeningB++;
    //         } else { 
    //             noOfunmatchedOpeningB--;

    //             if (noOfunmatchedOpeningB < 0) {
    //                 noOfOeningRequiredForClosingB++;  
    //                 noOfunmatchedOpeningB = 0;  
    //             }
    //         }
    //     }

    //     return noOfOeningRequiredForClosingB + noOfunmatchedOpeningB;

    
    
    Deque <Character> stack = new ArrayDeque<>();

    for(char c : s.toCharArray()){

        if(c == '('){
            stack.push(c);
        }
        else{
        if(!stack.isEmpty() && stack.peek() == '('){
            stack.pop();

        }
        else{
            stack.push(c);
        }
        }
    }

    return stack.size();
        }   
         
    }
