package ss10_stack.exercise.bracket_checker_stack;

import java.util.Stack;

public class BracketCheckerStack {
    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s – a) * (s – b * (s – c)";
        String expression4 = "s * (s – a) * s – b) * (s – c)";
        String expression5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println("Expression 1: " + checkBrackets(expression1));
        System.out.println("Expression 2: " + checkBrackets(expression2));
        System.out.println("Expression 3: " + checkBrackets(expression3));
        System.out.println("Expression 4: " + checkBrackets(expression4));
        System.out.println("Expression 5: " + checkBrackets(expression5));
    }

    public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch); // đẩy vào stack
            } else if (ch == ')') {
                if (stack.isEmpty()) { // nếu rỗng thì false
                    return false;
                } else if (stack.peek() == '(') { // nếu trong stack đã tồn tại "(" thì xong tốt
                    stack.pop(); // xóa cái "(" đó đi, xem như 1 cụm ()
                } else {
                    return false; // ngoài ra trước đó chưa có "(" mà giờ lại là ")" thì false
                }
            }
        }

        return stack.isEmpty();
    }
}

