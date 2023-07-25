package ss19_string_regex.exercise.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    public static boolean isValidClassName(String className) {
        // Biểu thức chính quy để kiểm tra tính hợp lệ của tên lớp học
        String regex = "^[CAP]\\d{4}[GHIK]$";

        // Tạo đối tượng Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo đối tượng Matcher để so khớp tên lớp học với biểu thức chính quy
        Matcher matcher = pattern.matcher(className);

        // Kiểm tra xem tên lớp học có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] classNames = {"C0223G", "A0323K", "M0318G", "P0323A"};

        for (String className : classNames) {
            if (isValidClassName(className)) {
                System.out.println(className + " là tên lớp hợp lệ.");
            } else {
                System.out.println(className + " không phải là tên lớp hợp lệ.");
            }
        }
    }
}

