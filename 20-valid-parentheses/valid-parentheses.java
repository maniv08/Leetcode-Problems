import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If stack is empty when encountering a closing bracket, it's invalid
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top and check if it matches
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}