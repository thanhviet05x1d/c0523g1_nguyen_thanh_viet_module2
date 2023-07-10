package ss06_ke_thua.exercise.circle_cylinder;

public class Cylinder extends Circle {
    double height = 9.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A cylinder height ="
                + this.getHeight()
                +" and radius ="
                + super.getRadius()
                +" .Area ="
                + super.getArea()
                + " .It's color ="
                + this.getColor()
                + " and Volume ="
                + this.getVolume();
    }
}
