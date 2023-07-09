package ss05_access_modifier_static_getter_setter.quiz;

public class MyClassQ5 {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        MyClassQ5 o = new MyClassQ5();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
