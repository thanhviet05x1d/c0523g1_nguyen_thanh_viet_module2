package ss10_stack.exercise.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Kiểm tra hàng đợi trống
        System.out.println("Is Queue empty? " + queue.isEmpty());

        // Thêm phần tử vào hàng đợi
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        // Hiển thị hàng đợi
        queue.displayQueue();

        // Lấy ra phần tử từ hàng đợi
        System.out.println("Dequeued item: " + queue.deQueue());

        // Hiển thị hàng đợi sau khi lấy ra
        queue.displayQueue();

        // Kiểm tra hàng đợi trống
        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}
/*
Trong chương trình kiểm thử này, chúng ta tạo một đối tượng Queue và thực hiện các hoạt động sau:

Kiểm tra hàng đợi trống bằng cách gọi phương thức isEmpty() và in ra kết quả.

Thêm ba phần tử vào hàng đợi bằng cách gọi phương thức enQueue().

Hiển thị hàng đợi bằng cách gọi phương thức displayQueue().

Lấy ra phần tử đầu tiên từ hàng đợi bằng cách gọi phương thức deQueue() và in ra giá trị của phần tử đã lấy ra.

Hiển thị hàng đợi sau khi lấy ra phần tử.

Kiểm tra lại hàng đợi trống bằng cách gọi phương thức isEmpty() và in ra kết quả.

Chạy chương trình kiểm thử sẽ cho kết quả hiển thị trên console tương ứng với các hoạt động thực hiện trên hàng đợi.
*/
