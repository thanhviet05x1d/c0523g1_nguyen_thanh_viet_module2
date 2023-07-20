package ss14_thuat_toan_sap_xep.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortTest {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần thứ " + i + " của mảng");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        //Kết quả
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp chèn: " + Arrays.toString(array));
    }
}
