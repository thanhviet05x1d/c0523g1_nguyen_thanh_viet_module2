package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class MaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận");
        int rows = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận");
        int cols = scanner.nextInt();

        // Khai báo ma trận
        int myMatrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập vào giá trị phần tử dòng " + i + " và cột " + j);
                myMatrix[i][j] = scanner.nextInt();
            }
        }
        // In ra mảng vừa nhập
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        // Tìm ra giá trị lớn nhất trong mảng
        int max = myMatrix[0][0];
        int indexRowMax = 0;
        int indexColMax = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (myMatrix[i][j] > max) {
                    max = myMatrix[i][j];
                    indexRowMax = i;
                    indexColMax = j;
                }
            }
        }
        System.out.print("Giá trị lớn nhất trong mảng là " + max + " tại dòng " + indexRowMax + " và cột " + indexColMax);
    }
}
