package ss10_stack.exercise.convert_ten_to_two;

import java.util.Scanner;
import java.util.Stack;

public class DecToBinConverter {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số nguyên");
        Scanner scanner = new Scanner(System.in);
        int decNum = Integer.parseInt(scanner.nextLine());
        String binNum = decToBinConverter(decNum);
        System.out.println("Số nhị phân đó là: " + binNum);
    }

/* ---- Cách 1 ----
    static String decToBinConverter(int decNum) {
        String binNumTemp = "";
        Stack<Integer> stack = new Stack<>();

        do {
            stack.push(decNum % 2);
            decNum = decNum / 2;

        } while (decNum != 0);

        while (!stack.isEmpty()) {
            binNumTemp += stack.pop();
        }
        return binNumTemp;
    }
}
*/

    // ---- Cách 2 ----
    static String decToBinConverter(int decNum) {
        Stack<Integer> stack = new Stack<>();

        do {
            stack.push(decNum % 2);
            decNum = decNum / 2;
        } while (decNum != 0);

        StringBuilder binNumBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            binNumBuilder.append(stack.pop());
        }
        return binNumBuilder.toString();
    }
}