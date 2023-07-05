package ss03_mang_phuong_thuc_java.exercise;

public class Algorithms230705 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                if (j == i || j == -i) {
                    if (j > 0) {
                        System.out.print(+j);
                    } else {
                        System.out.print((-j));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = -5; j <= 5; j++) {
                if (j == i || j == -i) {
                    if (j > 0) {
                        System.out.print(+j);
                    } else {
                        System.out.print((-j));
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
