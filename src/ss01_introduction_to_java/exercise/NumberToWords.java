package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberToWords {
    private static final String[] ones = {
            "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
            "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"
    };
    private static final String[] tens = {
            "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };
    private static final String[] bigNames = {
            "", "ngàn", "triệu", "tỷ"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm (tối đa 11 chữ số): ");
        long number = scanner.nextLong();

        String numberInWords = convertToWords(number);
        System.out.println("Số " + number + " viết bằng chữ là: " + numberInWords);
    }

    public static String convertToWords(long number) {
        if (number == 0) {
            return "không";
        }

        if (number < 0 || number > 999_999_999_999L) {
            return "Số không hợp lệ";
        }

        String words = "";

        int bigGroupIndex = 0;
        while (number > 0) {
            int group = (int) (number % 1_000);
            if (group != 0) {
                String groupWords = convertGroupToWords(group);
                words = groupWords + " " + bigNames[bigGroupIndex] + " " + words;
            }
            number /= 1_000;
            bigGroupIndex++;
        }

        return words.trim();
    }

    private static String convertGroupToWords(int number) {
        String groupWords = "";

        int hundred = number / 100;
        if (hundred > 0) {
            groupWords += ones[hundred] + " trăm ";
        }

        int lastTwoDigits = number % 100;
        if (lastTwoDigits < 20) {
            groupWords += ones[lastTwoDigits];
        } else {
            int tensDigit = lastTwoDigits / 10;
            int onesDigit = lastTwoDigits % 10;
            groupWords += tens[tensDigit] + " " + ones[onesDigit];
        }

        return groupWords.trim();
    }
}
