package ss06_ke_thua.content;

public class Circle extends Geometric {
    /* mở rộng trường dữ liệu của lớp cha */
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
//        super(color, filled);
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        System.out.println("The " + getColor() + " circle is created with the radius is " + this.radius);
    }
}
