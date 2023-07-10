package ss03_mang_phuong_thuc_java.content_pass_by_value;

public class Increment{
    public static void main(String[] args) {
        int x=1;
        System.out.println("Before the call, x is "+x);
        increment(x);
        System.out.println("After the call, x is "+x);
    }
    public static void increment(int n){
        n++;
    }
}
