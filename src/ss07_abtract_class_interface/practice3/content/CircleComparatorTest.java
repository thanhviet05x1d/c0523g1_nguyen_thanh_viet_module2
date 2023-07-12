package ss07_abtract_class_interface.practice3.content;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(3.1);
        circles[1] = new Circle(1.1);
        circles[2] = new Circle(4.1);
        circles[3] = new Circle(2.1);
        System.out.println("Trước khi so sánh");
        for (Circle c : circles) {
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator(); // tạo 1 đối tượng circleComparator để ss
        Arrays.sort(circles, circleComparator); // so sánh
        System.out.println("Sau khi so sánh");
        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
