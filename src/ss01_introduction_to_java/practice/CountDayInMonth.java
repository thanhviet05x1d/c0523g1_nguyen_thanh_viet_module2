import java.util.Scanner;

public class CountDayInMonth {
    public static void main(String[] args) {
        int month;
        String days = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng từ 1 đến 12 bạn cần tính ngày");
        month = scanner.nextInt();
        if (month < 0 || month > 12) {
            System.out.println("Mời bạn nhập vào tháng từ 1 đến 12");
        } else {
            switch (month) {
                case 2:
                    days = "28 hoặc 29 ngày";
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = "31 ngày";
                    break;
                default:
                    days = "30 ngày";
            }
        }
        System.out.println("Tháng " + month + " có " + days + " ngày");
    }
}
