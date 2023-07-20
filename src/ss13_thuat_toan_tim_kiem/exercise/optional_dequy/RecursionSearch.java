package ss13_thuat_toan_tim_kiem.exercise.optional_dequy;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionSearch {
    public static void main(String[] args) {
        //1.Nhập mảng
        System.out.println("Hãy nhập một dãy số cách nhau khoảng cách:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        String str = "1 3 4 6.5 7 8 3. 2.3";
        String[] strArr = str.split("\\s+");
        double[] myArr = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            myArr[i] = Double.parseDouble(strArr[i]);
        }
        //2. Sắp xếp mảng
        Arrays.sort(myArr);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        System.out.println(Arrays.toString(myArr));

        //3. Tìm kiếm nhị phân
        System.out.println("Nhập vào số cần tìm:");
        double numFind = Double.parseDouble(scanner.nextLine());
        System.out.println(Arrays.toString(myArr));
        int result = binarySearch(myArr, 0, myArr.length, numFind);
        if (result == -1) {
            System.out.println("Số " + numFind + " không tìm thấy trong dãy.");
        } else {
            System.out.println("Số " + numFind + " nằm ở vị trí thứ: " + (result + 1));
        }
    }

    public static int binarySearch(double[] array, int left, int right, double value) {
        do {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else if (value < array[middle]) {
                right = middle - 1;
            }
        } while (left <= right);
        return -1;
    }
}
