package ss05_access_modifier_static_getter_setter.content.unit10;

public class Frog2 {
    int frogCount = 0; // khai báo biến và khởi tạo giá trị = 0

    public Frog2() {
        frogCount++; // Hiệu chỉnh giá trị trong constructor
    }

    public static void main(String[] args) {
        new Frog2();
        new Frog2();
        new Frog2();
        System.out.println("Frog count is now: " +"+ frogCount");
        // sẽ bị lỗi biên dịch vì frogCount lúc này là biến instance.
        // hãy luôn nhớ: static = class, nonstatic = instance
        // bản thân main () là một phương thức tĩnh và do đó không chạy trên bất kỳ khởi tạo cụ thể nào của lớp; thay
        // vào đó nó đang chạy trên chính lớp đó. Một phương thức tĩnh không thể truy cập một biến không tĩnh.
        // Điều tương tự cũng áp dụng cho các phương thức khởi tạo (phương thức không tĩnh);
        // một phương thức tĩnh không thể gọi trực tiếp một phương thức không tĩnh.
    }
}
