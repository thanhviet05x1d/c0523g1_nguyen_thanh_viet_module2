import java.util.Scanner;

public class NumberToWords {
    private static final String[] ones = {
            "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
            "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"
    };
    private static final String[] tens = {
            "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm (tối đa 9 chữ số): ");
        int number = scanner.nextInt();

        String numberInWords = convertToWords(number);
        System.out.println("Số " + number + " viết bằng chữ là: " + numberInWords);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "không";
        }

        if (number < 0 || number > 999_999_999) {
            return "Số không hợp lệ";
        }

        String words = "";

        if ((number / 1_000_000) > 0) {
            words += convertToWords(number / 1_000_000) + " triệu ";
            number %= 1_000_000;
        }

        if ((number / 1_000) > 0) {
            words += convertToWords(number / 1_000) + " nghìn ";
            number %= 1_000;
        }

        if ((number / 100) > 0) {
            words += ones[number / 100] + " trăm ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += ones[number];
            } else {
                words += tens[number / 10] + " " + ones[number % 10];
            }
        }

        return words;
    }
}

