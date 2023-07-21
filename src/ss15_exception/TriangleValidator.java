package ss15_exception;

import java.util.Scanner;

public class TriangleValidator {
    public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác phải là số dương.");
        }

        if (a + b <= c || b + c <= a || a + c <= b) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại để tạo thành tam giác.");
        }

    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào cạnh a: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào cạnh b: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào cạnh c: ");
            double c = Double.parseDouble(scanner.nextLine());
            validateTriangle(a, b, c);
            System.out.println("Ba cạnh " + a + ", " + b + ", " + c + " tạo thành một tam giác.");
        } catch (IllegalTriangleException err) {
            System.out.println("Lỗi: " + err.getMessage());
        } catch (NumberFormatException err) {
            System.out.println("Bạn cần nhập vào là dạng số!");
        }
    }
}
