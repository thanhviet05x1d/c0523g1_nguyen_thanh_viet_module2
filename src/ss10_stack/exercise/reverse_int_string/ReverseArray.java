package ss10_stack.exercise.reverse_int_string;


import java.util.Stack;

public class ReverseArray {

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        System.out.println("Kết quả trước khi đảo");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]+" ");
        }

        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < myArr.length; i++) {
            myStack.push(myArr[i]);
        }
        for (int i = 0; i < myArr.length; i++) {
            myArr[i]=myStack.pop();
        }

        System.out.println("\nKết quả sau khi đảo");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i]+" ");
        }
    }
}



