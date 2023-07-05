package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class SumOffColumnMatrix {
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
        // Cho người dùng nhập vào cột cần tính tổng
        int col = 0;
        do {
            System.out.println("Nhập vào cột cần tính tổng");
            col = scanner.nextInt();
            if (col < 0 || col > myMatrix[0].length) {
                System.out.println("Mời bạn nhập lại giá trị cột >=0 và nhỏ hơn " + myMatrix[0].length);
            }
        } while (col < 0 || col > myMatrix[0].length);

        //Thực hiện tính tổng:
        int sum = 0;
        for (int i = 0; i < myMatrix.length; i++) {
            sum += myMatrix[i][col];
        }
        System.out.println("Tổng tất cả giá trị phần tử cột thứ " + col + " bằng: " + sum);
    }
}
