import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Phương trình có dạng 'a * x + b = 0', Vui lòng nhập vào các hệ số");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double result = -b / a;
            System.out.printf("" + result);
        } else {
            if (b == 0) {
                System.out.printf("Phương trình vô số nghiệm");
            } else {
                System.out.printf("Phương trình vô nghiệm");
            }
        }
    }
}