package ss07_abtract_class_interface.exercise1;

// Mục tiêu:Luyện tập kỹ năng lập bản thiết kế và triển khai lớp đối tượng kế thừa.
// Nên khai báo abstract cho Shape vì nó là một lớp trừu tượng.
// Vì lớp trừu tượng thì implement, ta không cần phải triển khai phương thức resize
// Mục đích implement là để cho tất cả các lớp con của Shape có tính năng thừa hưởng Resizeable
public abstract class Shape implements Resizeable{
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}