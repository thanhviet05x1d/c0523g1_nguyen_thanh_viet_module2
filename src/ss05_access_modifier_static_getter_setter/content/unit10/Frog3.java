package ss05_access_modifier_static_getter_setter.content.unit10;

public class Frog3 {
    int frogCount = 0; // khai báo biến và khởi tạo giá trị = 0
    public Frog3() {
        frogCount++; // Hiệu chỉnh giá trị trong constructor
    }
    public static void main(String[] args) {
        Frog3 frog3a=new Frog3();
        Frog3 frog3b=new Frog3();
        Frog3 frog3c=new Frog3();

        System.out.println("Frog count is now: " + frog3c.frogCount);
        // Chú ý: Biến frogCount lúc này nó là biến trực thuộc đối tượng frog3c
        // Và kế quả lúc này sẽ là 1
    }
}
