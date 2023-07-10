package ss05_access_modifier_static_getter_setter.content.unit11;

//Đối với các thành viên không tĩnh (phương thức và biến khởi tạo), chúng ta sử dụng toán tử dấu chấm (.)
// trên một tham chiếu đến một khởi tạo đối tượng như trong ví dụ sau:
public class Frog {
    int frogSize = 0; // Khai báo biến instance và gán giá trị =0;

    public Frog(int s) { // Một constructor Frog có tham số khởi tạo s
        this.frogSize = s;
    }

    public int getFrogSize() { // Method lấy thông tin FrogSize
        return frogSize;
    }

    public static void main(String[] args) {
        Frog f = new Frog(25);
        System.out.println(f.getFrogSize());
    }
}
/* Trong đoạn mã trên, chúng ta khởi tạo một Frog, gán nó cho biến tham chiếu f,
và sau đó sử dụng tham chiếu f đó để gọi một phương thức trên đối tượng Frog mà chúng ta vừa tạo.
Nói cách khác, phương thức getFrogSize () đang được gọi trên một đối tượng Frog cụ thể trên heap.
*/