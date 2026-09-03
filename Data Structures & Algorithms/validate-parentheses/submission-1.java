class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else { // ch is ')' or '}' or ']'
                // look for corresponding opening tag in stack
                if (stack.isEmpty()) {
                    return false; // closing tags more than opening tags
                }
                char top = stack.peek();
                if ((ch == ')' && top == '(') || (ch == ']' && top == '[')
                    || (ch == '}' && top == '{')){
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
