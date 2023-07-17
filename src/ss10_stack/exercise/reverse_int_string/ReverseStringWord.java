package ss10_stack.exercise.reverse_int_string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();
        Stack<String> myStack = new Stack();

        for (String str : inputString.split(" ")) {
            myStack.push(str);
        }

        String reverseString = "";
        while (!myStack.isEmpty()) {
            reverseString += myStack.pop()+" ";
        }
        System.out.println(reverseString);
    }
}
