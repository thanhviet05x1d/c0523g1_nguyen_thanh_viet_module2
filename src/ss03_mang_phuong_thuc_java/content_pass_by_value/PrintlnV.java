package ss03_mang_phuong_thuc_java.content_pass_by_value;

public class PrintlnV {
    public static void main(String[] args) {
        nPrintln("Hello", 5);
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
