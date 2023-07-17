package ss10_stack.exercise.reverse_int_string;

import java.util.Stack;

public class ReverseStringChar {
    public static void main(String[] args) {
        String myStr = "Nguyễn Thanh Việt";
        String reverseString = "";
        System.out.println("Kết quả trước khi đảo");
        for (int i = 0; i < myStr.length(); i++) {
            System.out.print(myStr.charAt(i) + "");
        }

        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < myStr.length(); i++) {
            myStack.push(myStr.charAt(i));
        }

        for (int i = 0; i < myStr.length(); i++) {
            reverseString += myStack.pop();
        }

        System.out.println("\nKết quả sau khi đảo");
        for (int i = 0; i < reverseString.length(); i++) {
            System.out.print(reverseString.charAt(i) + "");
        }
    }
}
