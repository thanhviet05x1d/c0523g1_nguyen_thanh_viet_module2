package ss05_access_modifier_static_getter_setter.quiz;

public class MyClassQ3 {
    static public int X = 2;

    public static void main(String[] args) {
        MyClassQ3 o1 = new MyClassQ3();
        MyClassQ3 o2 = new MyClassQ3();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClassQ3.X);
    }
}
