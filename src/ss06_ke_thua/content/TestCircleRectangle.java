package ss06_ke_thua.content;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle=new Circle(1);
        circle.setFilled("black");
        System.out.println("A circle "+circle.toStringInfor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The diameter is "+circle.getDiameter());
        System.out.println("The Area is "+circle.getArea());
        System.out.println("The Perimeter is "+circle.getPerimeter());
        System.out.println();
        Rectangle rectangle =new Rectangle(2,4);
        System.out.println("A rectangle "+rectangle.toStringInfor());
        rectangle.setFilled("green");
        System.out.println("A rectangle "+rectangle.toStringInfor());
        System.out.println("The Area "+rectangle.getArea());
        System.out.println("The Perimeter "+rectangle.getPerimeter());
        System.out.println();
    }
}
