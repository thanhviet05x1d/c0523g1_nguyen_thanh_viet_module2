package ss03_mang_phuong_thuc_java.practice;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        int n;
        do {
            System.out.println("Nhập vào số lượng sinh viên ");
            n = scanner.nextInt();
            if (n < 0 || n > 30) {
                System.out.println("Bạn nhập số lượng sinh viên <30 thôi");
            }
        } while (n < 0 || n > 30);
        System.out.println("Số lượng sinh viên là: " + n);

        // Nhập điểm cho sinh viên
        double myArr[] = new double[n];
        int i = 0;
        double diem;
        while (i < myArr.length) {
            do {
                System.out.println("Nhập điểm cho sinh viên thứ " + i);
                diem = scanner.nextDouble();
                if (diem < 0 || diem >= 10) {
                    System.out.println("Bạn nhập điểm cần phải >0 và nhỏ hơn hoặc bằng 10");
                }
            } while (diem < 0 || diem >= 10);
            myArr[i] = diem;
            i++;
        }
        // Hiển thị điểm của học sinh:
        int count = 0;
        String listMark = "";
        for (int j = 0; j < myArr.length; j++) {
            if (myArr[j] >= 5) {
                count++;
            }
            listMark += myArr[j] + ",";
        }
        System.out.println("Bảng điểm của lớp: " + listMark);
        System.out.println("Số học sinh đỗ: " + count);
    }
}
