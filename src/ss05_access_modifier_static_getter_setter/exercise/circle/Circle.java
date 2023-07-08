package ss05_access_modifier_static_getter_setter.exercise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    // Nếu để Access Modifier = private, ta không thể truy cập được
    // Từ 1 class khác. Tuy nhiên vẫn truy cập được ở class này.
    // Ví dụ ta tạo phương thức main ở chính class này.
    //    private double getRadius() {
    //        return this.radius;
    //    }

    // Nếu để Access Modifier = protected, ta vẫn truy cập được.
    // Từ 1 class khác. Tuy nhiên vẫn truy cập được ở class này.
    // Ví dụ ta tạo phương thức main ở chính class này.
    //    protected double getRadius() {
    //        return this.radius;
    //    }

    // Nếu để Access Modifier = default, ta vẫn truy cập được.
    // Từ 1 class khác. Tuy nhiên vẫn truy cập được ở class này.
    // Ví dụ ta tạo phương thức main ở chính class này.
    //    double getRadius() {
    //        return this.radius;
    //    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

}
