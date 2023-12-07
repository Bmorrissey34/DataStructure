import java.util.Stack;

public class Balanced {
    public static boolean isBalanced2(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
