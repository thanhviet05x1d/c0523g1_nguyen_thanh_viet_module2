import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Nhập năm từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Kiểm tra xem năm có phải là năm nhuận hay không
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Hiển thị kết quả
        if (isLeapYear) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
}
