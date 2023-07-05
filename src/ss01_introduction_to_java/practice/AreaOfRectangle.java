import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Khai báo đối tượng Scanner
        double width;
        double height;
        System.out.println("Nhập vào chiều rộng");
        width = scanner.nextDouble();
        System.out.println("Nhập vào chiều dài");
        height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Dien thich chu nhat la: " + area);
    }
}
