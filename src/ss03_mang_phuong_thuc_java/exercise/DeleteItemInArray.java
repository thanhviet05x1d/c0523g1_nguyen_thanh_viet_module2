import java.util.Scanner;

public class DeleteItemInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.println("Nhập vào số lượng phần tử của mảng:");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng kích thước n
        int arr[] = new int[n];

        // Nhập các phần tử cho mảng
        System.out.println("Nhập giá trị cho các phần tử mảng.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ: " + i);
            arr[i] = scanner.nextInt();
        }

        // Nhập phần tử cần xóa
        System.out.println("Nhập vào giá trị phần tử cần xóa");
        int x = scanner.nextInt();

        // Kiểm tra phần tử x có tồn tại trong mảng hay không
        boolean found = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                index = i;
                break;
            }
        }

        // Xóa phần tử index tìm thấy
        if (found == true) {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1]=0; // Hơi củ chuối, nhưng có vẻ đơn giản
            System.out.println("Mảng sau khi xóa đi phần tử:");
            for (int value : arr) {
                System.out.println(value);
            }
        } else {
            System.out.println("Không tìm thấy giá trị " + x + " trong mảng");
        }
    }
}
