package ss07_abtract_class_interface.exercise;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 3.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "color", true);
        System.out.println(rectangle);
    }
}
