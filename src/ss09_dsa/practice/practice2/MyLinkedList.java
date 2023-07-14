package ss09_dsa.practice.practice2;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}

/*
Code trên định nghĩa một lớp MyLinkedList trong Java để thao tác với một danh sách liên kết đơn.
Dưới đây là giải thích từng phương thức và lớp con trong mã:

1. Lớp `MyLinkedList`:
   - `private Node head`: Đây là nút đầu tiên trong danh sách liên kết.
   - `private int numNodes`: Đây là số lượng các nút trong danh sách liên kết.

2. Phương thức khởi tạo `MyLinkedList(Object data)`:
   - Khởi tạo một danh sách liên kết với một đối tượng dữ liệu ban đầu và gán nút đầu tiên (head) cho đối tượng này.

3. Phương thức `add(int index, Object data)`:
   - Thêm một đối tượng dữ liệu vào vị trí được chỉ định trong danh sách liên kết.
   - Tạo một nút tạm thời (temp) và một nút giữ chỗ (holder).
   - Duyệt qua danh sách liên kết để đến vị trí trước vị trí cần thêm.
   - Gán nút tiếp theo của temp cho holder.
   - Tạo một nút mới với dữ liệu được cung cấp và gán nút này cho nút tiếp theo của temp.
   - Gán nút tiếp theo của nút mới cho holder.
   - Tăng số lượng các nút trong danh sách.

4. Phương thức `addFirst(Object data)`:
   - Thêm một đối tượng dữ liệu vào vị trí đầu tiên của danh sách liên kết.
   - Tạo một nút tạm thời (temp) và gán nút đầu tiên hiện tại cho temp.
   - Tạo một nút mới với dữ liệu được cung cấp và gán nút này cho nút đầu tiên (head).
   - Gán nút tiếp theo của nút mới là temp.
   - Tăng số lượng các nút trong danh sách.

5. Phương thức `get(int index)`:
   - Truy cập và trả về nút ở vị trí được chỉ định trong danh sách liên kết.
   - Tạo một nút tạm thời (temp) và duyệt qua danh sách đến vị trí cần truy cập.
   - Trả về nút tại vị trí đó.

6. Phương thức `printList()`:
   - In ra tất cả các đối tượng dữ liệu trong danh sách liên kết.
   - Tạo một nút tạm thời (temp) và duyệt qua danh sách, in ra dữ liệu của từng nút và di chuyển đến nút tiếp theo.

7. Lớp con `Node`:
   - Định nghĩa một nút trong danh sách liên kết.
   - `private Node next`: Đây là nút tiếp theo trong danh sách liên kết.
   - `private final Object data`: Đây là dữ liệu của nút.
   - Phương thức khởi tạo `Node(Object data)`: Khởi tạo một nút với dữ liệu được cung cấp.
   - Phương thức `getData()`: Trả về dữ liệu của nút.
 */