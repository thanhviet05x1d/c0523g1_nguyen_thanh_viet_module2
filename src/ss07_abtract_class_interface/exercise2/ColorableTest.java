package ss07_abtract_class_interface.exercise2;

// Mục tiêu:Luyện tập thiết kế và triển khai interface.
public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(6);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Square) { // kiểm tra trong mảng có phần tử kiểu Square không?
                ((Colorable) shape).howToColor(); // ép kiểu về Colorable để hiện method
//                ((Square) shape).howToColor(); // hoă để kiểu Square cũng đươc.
            }
            System.out.println();
        }
    }
}
