package ss06_ke_thua.exercise;

public class Circle {
    double radius = 5.0;
    String color = "blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A cirle with radius = "
                + this.getRadius()
                + " It's color ="
                + this.getColor()
                + " and Area ="
                + this.getArea();
    }
}
