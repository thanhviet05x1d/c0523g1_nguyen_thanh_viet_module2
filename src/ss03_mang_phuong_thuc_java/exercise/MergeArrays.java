package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo và khởi tạo mảng 1
        System.out.println("Nhập vào chiều dài mảng 1:");
        int n1 = scanner.nextInt();
        double arr1[] = new double[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Nhập vào gi trị phần tử thứ " + i);
            arr1[i] = scanner.nextDouble();
        }

        // Khai báo và khởi tạo mảng 2

        System.out.println("Nhập vào chiều dài mảng 2:");
        int n2 = scanner.nextInt();
        double arr2[] = new double[n2];
        for (int i = 0; i < n2; i++) {
            System.out.println("Nhập vào gi trị phần tử thứ " + i);
            arr2[i] = scanner.nextDouble();
        }

        // Khai báo và khởi tạo mảng 3
        double arr3[] = new double[n1 + n2];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("Mảng 3 là:");
        for (double value : arr3) {
            System.out.print(value + ", ");
        }
    }
}
