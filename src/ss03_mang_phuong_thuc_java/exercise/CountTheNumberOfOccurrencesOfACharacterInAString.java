package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class CountTheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một chuỗi ký tự");
        String myStr = scanner.nextLine();

        System.out.print("Nhập vào ký tự cần đếm: ");
        char myChar = scanner.next().charAt(0);

        // Đếm số lần xuất hiện

        int count = 0;
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == myChar) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + myChar + " là: " + count);
    }
}
