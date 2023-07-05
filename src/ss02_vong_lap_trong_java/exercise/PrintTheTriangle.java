package ss02_vong_lap_trong_java.exercise;

import java.util.Scanner;

public class PrintTheTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        int height=scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
