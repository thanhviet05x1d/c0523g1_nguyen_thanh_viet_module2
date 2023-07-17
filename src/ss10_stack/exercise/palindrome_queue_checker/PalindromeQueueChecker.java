package ss10_stack.exercise.palindrome_queue_checker;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeQueueChecker {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("Là dãy Palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        String inputLower = input.replace(" ","").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputLower.length() - 1; i >= 0; i--) {
            queue.add(inputLower.charAt(i));
        }

        StringBuilder reversedInput = new StringBuilder();

        while (!queue.isEmpty()) {
            reversedInput.append(queue.remove());
        }
        return inputLower.equals(reversedInput.toString());
        // Cần chuyển reversedInput .toString vì nó đang là StringBuilder
    }
}
