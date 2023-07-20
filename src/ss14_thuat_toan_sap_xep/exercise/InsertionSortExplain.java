package ss14_thuat_toan_sap_xep.exercise;

import java.util.Arrays;

public class InsertionSortExplain {
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
            printArray(array, i);
        }
    }

    public static void printArray(int[] array, int step) {
        System.out.print("Bước " + step + ": ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp chèn: " + Arrays.toString(array));
    }
}
