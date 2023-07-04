import java.util.Scanner;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giới hạn số nguyên tố lớn nhất");
        int maxPrime = scanner.nextInt();
        int num = 2;
        while (num < maxPrime) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime=true;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
