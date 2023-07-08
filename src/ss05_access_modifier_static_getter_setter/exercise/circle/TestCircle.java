package ss05_access_modifier_static_getter_setter.exercise.circle;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle(10.2);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
