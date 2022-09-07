package valid_parentheses;

import java.util.Stack;

public class Solution {
    //    public boolean isValid(String s) {
//        if (s.length() == 0)
//            return true;
//
//        Stack<Character> st = new Stack();
//
//        for (char c :
//                s.toCharArray()) {
//            switch(c) {
//                case '[':
//                case '{':
//                case '(':
//                    st.push(c);
//                    break;
//
//                case ')':
//                    if (st.isEmpty() || st.peek() != '(')
//                        return false;
//                    st.pop();
//                    break;
//                case '}':
//                    if (st.isEmpty() || st.peek() != '{')
//                        return false;
//                    st.pop();
//                    break;
//                case ']':
//                    if (st.isEmpty() || st.peek() != '[')
//                        return false;
//                    st.pop();
//            }
//
//        }
//        if (st.isEmpty())
//            return true;
//
//        return false;
//    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
