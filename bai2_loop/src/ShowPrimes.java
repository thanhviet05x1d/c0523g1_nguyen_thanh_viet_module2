import java.util.Scanner;

public class ShowPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố cần in ra:");
        int limit = scanner.nextInt();
        int num = 2;
        int numOfPrime = 0;

        while (numOfPrime < limit) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numOfPrime++;
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
