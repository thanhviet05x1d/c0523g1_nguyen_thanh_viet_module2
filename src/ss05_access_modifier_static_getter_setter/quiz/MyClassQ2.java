package ss05_access_modifier_static_getter_setter.quiz;

public class MyClassQ2 {
    static public int X = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        MyClassQ2 o = new MyClassQ2();
        MyClassQ2.method();
        MyClassQ2.X = 10;
        System.out.printf("x=%d, y=%d", o.X, MyClassQ2.X);
    }
}
