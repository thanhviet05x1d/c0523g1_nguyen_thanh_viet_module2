import java.util.Scanner;

public class PrintTheRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều rộng hcn: ");
        int height=scanner.nextInt();
        System.out.println("Nhập chiều rộng hcn: ");
        int width=scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
