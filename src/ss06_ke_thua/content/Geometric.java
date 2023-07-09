package ss06_ke_thua.content;

public class Geometric {
    // Các trường dữ liệu
    private String color = "white";
    private String filled = null;

    //Constructor rỗng
    public Geometric() {

    }

    // Constructore 2 tham số
    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
    // Các phương thức


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }

    public String toStringInfor() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "fill with \"" + filled + "\" color");
    }
}


