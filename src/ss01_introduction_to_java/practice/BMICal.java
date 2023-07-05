import java.util.Scanner;

public class BMICal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Mời bạn nhập cân nặng: ");
        weight=scanner.nextDouble();
        System.out.println("Mời bạn nhập chiều cao: ");
        height=scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

    }

}
