package ss06_ke_thua.exercise.triangle;

import java.util.Arrays;

public class Triangle extends Shape {
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double[] getSides() {
        double arr[] = {this.side1, this.side2, this.side3};
        return arr;
    }

    public void setSides(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double s2 = p * (p - this.side1) * (p - this.side2) * (p - this.side3);
        return Math.pow(s2, 0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + this.side1 +
                ", side2=" + this.side2 +
                ", side3=" + this.side3 +
                ", color=" + super.getColor() + " and " +
                (isFilled() ? "filled" : "not filled") +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSides(3, 4, 5.7);
        triangle.setColor("yellow");
        System.out.println(triangle);
        System.out.println(Arrays.toString(triangle.getSides()));
    }
}
