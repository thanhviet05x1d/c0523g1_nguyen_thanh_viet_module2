package ss07_abtract_class_interface.content.unit1;

public abstract class Geometric {
    private String name; // thuộc tính = biến static

    protected Geometric(String name) { // constructor
        this.name = name;
    }

    public String getName() { // Phương thức thường
        return this.name;
    }

    public abstract double getArea(); // Phương thức trừu tượng

    public abstract double getPerimeter(); // Phương thức trừu tượng
}

