package ss05_access_modifier_static_getter_setter.content.unit10;

public class Frog {
    static int frogCount = 0; // khai báo biến static và khởi tạo giá trị = 0

    public Frog() {
        frogCount++; // Hiệu chỉnh giá trị trong constructor
    }

    public static void main(String[] args) {
//        Frog frog1=new Frog();
//        Frog frog2=new Frog();
//        Frog frog3=new Frog();
        new Frog();
        new Frog();
        new Frog();
        /*
        Tuy nhiên, trong đoạn mã gốc, không có sử dụng các biến này sau khi tạo đối tượng.
Việc tạo ra đối tượng mà không gán chúng vào bất kỳ biến nào còn được gọi là việc tạo ra đối tượng "vô danh"
 (anonymous objects). Trong trường hợp này, đối tượng `Frog` được tạo ra và tăng giá trị của `frogCount`,
  nhưng không có biến được sử dụng để lưu trữ hoặc tham chiếu đến đối tượng đó sau khi nó được tạo.

Việc sử dụng đối tượng "vô danh" có thể hữu ích khi bạn chỉ quan tâm đến việc thực hiện
 một số công việc hoặc gọi một phương thức trên đối tượng đó mà không cần giữ tham chiếu lâu dài.
 Trong trường hợp này, việc tạo ra ba đối tượng "vô danh" `Frog` chỉ để tăng `frogCount` và in giá trị của nó.
*/
        System.out.println("Frog count is now: " + frogCount);
    }
}
