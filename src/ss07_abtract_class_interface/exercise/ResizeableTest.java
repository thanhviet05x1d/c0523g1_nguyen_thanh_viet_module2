package ss07_abtract_class_interface.exercise;

import java.util.Scanner;

public interface ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.2);
        shapes[1] = new Rectangle(3.4, 5.2);
        shapes[2] = new Square(3.4);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("Mời bạn nhập tỉ lệ tăng kích thước: ");
        Scanner scanner = new Scanner(System.in);
        double resizePercent = scanner.nextDouble();
        System.out.println("Sau khi tăng kích thước");
        for (Shape shape : shapes) {
            shape.resize(resizePercent);
            System.out.println(shape);
        }
    }
}

