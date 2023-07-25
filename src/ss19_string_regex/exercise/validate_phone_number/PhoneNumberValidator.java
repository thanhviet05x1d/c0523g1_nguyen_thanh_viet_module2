package ss19_string_regex.exercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ của số điện thoại
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

        // Tạo đối tượng Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo đối tượng Matcher để so khớp số điện thoại với biểu thức chính quy
        Matcher matcher = pattern.matcher(phoneNumber);

        // Kiểm tra xem số điện thoại có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] phoneNumbers = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

        for (String phoneNumber : phoneNumbers) {
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println(phoneNumber + " là số điện thoại hợp lệ.");
            } else {
                System.out.println(phoneNumber + " không phải là số điện thoại hợp lệ.");
            }
        }
    }
}

