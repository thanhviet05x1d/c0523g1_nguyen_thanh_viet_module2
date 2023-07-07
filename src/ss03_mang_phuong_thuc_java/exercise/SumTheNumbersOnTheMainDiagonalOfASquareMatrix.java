package ss03_mang_phuong_thuc_java.exercise;

import java.util.Scanner;

public class SumTheNumbersOnTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng và cột của ma trận vuông");
        int rows = scanner.nextInt();
        // Khai báo ma trận
        int myMatrix[][] = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Nhập vào giá trị phần tử dòng " + i + " và cột " + j);
                myMatrix[i][j] = scanner.nextInt();
            }
        }
        // In ra mảng vừa nhập
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        //Thực hiện tính tổng các giá trị của phần tử đường chéo:
        int sum = 0;
        for (int i = 0; i < myMatrix.length; i++) {
            int temp = myMatrix[i][i] + myMatrix[i][myMatrix.length - 1 - i];
            sum += temp;
        }
        System.out.println("Tổng tất cả giá trị trên 2 đường chéo bằng: " + sum);
    }
}

