package ss10_stack.exercise.queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            rear.setNext(front); // Liên kết vòng
        } else {
            rear.setNext(newNode);
            rear = newNode;
            rear.setNext(front); // Liên kết vòng
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removedValue = front.getValue();
        if (front == rear) { // Trường hợp chỉ còn một phần tử
            front = null;
            rear = null;
        } else {
            front = front.getNext();
            rear.setNext(front); // Liên kết vòng
        }

        return removedValue;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        System.out.print("Queue: ");
        do {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        } while (current != front);
        System.out.println();
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
/*
Trên đây là một ví dụ về cách triển khai lớp Queue sử dụng danh sách liên kết vòng trong Java:
Trong ví dụ trên, chúng ta triển khai lớp Queue sử dụng danh sách liên kết vòng. Lớp Queue có hai thuộc tính front và rear để theo dõi phần tử đầu và cuối của hàng đợi.

Các phương thức chính bao gồm:

isEmpty(): Kiểm tra xem hàng đợi có trống không.

enQueue(int value): Thêm một phần tử vào cuối hàng đợi. Nếu hàng đợi trống, thì front và rear đều trỏ đến nút mới tạo. Nếu không, nút mới được thêm vào cuối và liên kết vòng được thiết lập.

deQueue(): Lấy ra phần tử từ đầu hàng đợi. Nếu hàng đợi trống, thông báo rằng hàng đợi trống và trả về -1. Nếu không, phần tử đầu tiên được lấy ra và front được cập nhật. Nếu chỉ còn một phần tử trong hàng đợi, thì front và rear đều trở về null. Nếu không, liên kết vòng được thiết lập.

displayQueue(): Hiển thị các phần tử trong hàng đợi từ front đến rear. Nếu hàng đợi trống, thông báo rằng hàng đợi trống.

Trong ví dụ trên, chúng ta sử dụng lớp nộsted Node để biểu diễn các phần tử trong hàng đợi. Mỗi nút bao gồm một giá trị và một tham chiếu tới nút tiếp theo trong danh sách liên kết.
*/

