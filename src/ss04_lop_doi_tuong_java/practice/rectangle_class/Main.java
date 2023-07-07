package ss04_lop_doi_tuong_java.practice.rectangle_class;

import ss04_lop_doi_tuong_java.practice.rectangle_class.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Tạo đối tượng rectangle Class
        System.out.println("Mời bạn nhập vào chiều rộng của hcn");
        double width = scanner.nextDouble();
        System.out.println("Mời bạn nhập vào chiều cao của hcn");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích bằng: " + rectangle.getArea());
        System.out.println("Chu vi bằng: " + rectangle.getArea());
    }
}
