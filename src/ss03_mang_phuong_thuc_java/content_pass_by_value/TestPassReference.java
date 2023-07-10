package ss03_mang_phuong_thuc_java.content_pass_by_value;

public class TestPassReference {
    public static void main(String[] args) {
        int x=1; // x represent an array of int value
        int y[]=new int[10]; // y represent an array int values
        m(x,y);// invoke m with arguments x and y
        System.out.println("x is "+x);
        System.out.println("y is "+y[0]);
    }
    public static void m(int number, int numbers[]) {
        number = 1001; // Assign new value to number
        numbers[0] = 5555; // Assign new value to numbers[0]

    }
}
