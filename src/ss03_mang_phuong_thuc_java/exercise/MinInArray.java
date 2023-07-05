package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào chiều dài của mảng");
//        int n=scanner.nextInt();
//        int myArr[]=new int[n];
        int myArr[] = {5, 2, 3, 4, 0, 6, 1, 5, 3, 2};
        int min = myArr[0];
        for (int value : myArr) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
