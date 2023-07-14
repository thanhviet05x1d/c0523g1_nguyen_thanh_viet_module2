package ss09_dsa.exercise.array_list;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>(); // Tạo mảng
        myList.add(1); // Thêm phần tử
        myList.add(2); // Thêm phần tử
        myList.add(3); // Thêm phần tử
        System.out.println(myList.get(2)); // Show phần tử index = 2
        myList.add(4); // Thêm phần tử
        myList.add(5); // Thêm phần tử
        System.out.println(myList.get(4)); // Show phần tử index = 2
        myList.remove(2); // Xóa phần tử index = 2
        System.out.println(myList.get(2)); // Show phần tử index = 2
        System.out.println("Size of myList = " + myList.size());  // Show kích cỡ mảng
        System.out.println(myList.clone()); // Hiển thị địa chỉ tham chiếu mảng sau khi Clone
        System.out.println(myList.contains(2)); // Kiểm tra phần tử 2 có ở trong mảng không
        myList.add(3, 101); // Thêm phần tử 101 vào index = 3
        System.out.println(myList.get(3)); // Show phần tử index = 3
        // Add phần tử vào cuối mảng và báo thành công hay thất bại
        if (myList.add(103)) {
            System.out.println("Đã thêm phần tử vào cuối mảng thành công: " + myList.get(myList.size() - 1));
        } else {
            System.out.println("Không thêm được");
        }
    }
}
