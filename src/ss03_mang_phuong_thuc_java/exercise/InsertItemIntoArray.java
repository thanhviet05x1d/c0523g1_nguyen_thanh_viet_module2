package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class InsertItemIntoArray {
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

        // Nhập vào vị trí cần chèn
        System.out.println("Nhập vào vị trí cần chèn");
        int index = scanner.nextInt();
        boolean found = false;
        if (index < 0 || index > arr.length) {
            System.out.println("Mời bạn nhập vào chỉ số từ 0 đến " + arr.length);
            found = false;
        } else {
            found = true;
        }

        // Chèn phần tử tại vị trí index

        if (found) {
            // Duyệt mảng từ sau tới lấy giá trị tại n bằng giá trị tại n-1
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            System.out.println("Mời bạn nhập vào giá trị phần tử " + index + " bạn sẽ chèn");
            int x = scanner.nextInt();
            arr[index] = x;

            System.out.println("Mảng sau khi chèn vào phần tử:");
            for (int value : arr) {
                System.out.print(value+",");
            }
        }
    }
}
