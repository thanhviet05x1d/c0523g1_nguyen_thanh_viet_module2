package ss04_lop_doi_tuong_java.practice.rectangle_class;

public class Rectangle {

    // Đây là 2 thuộc tính của lớp Rec
    double width;
    double height;

    // ây là construtor rỗng
    public Rectangle() {

    }

    // Đây là constructor có 2 tham số
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Đây là Method tính diện tích
    public double getArea() {
        return this.width * this.height;
    }

    public String display() {
        return "Hình chữ nhật có chiều rộng = " + this.width + " chiều dài " + this.height;
    }

    // Giải thích từ khóa this như sau:
    /*
        public double getArea(double width, double height ) {
        return width * height; // Khi đó nó sẽ lấy tham số width và height trong phương thức getArea
        return this.width * this.height; // Khi đó nó vẫn sẽ lấy width và height trong class Rec
    }
     */

    // Đây là Method tính chu vi
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
}
