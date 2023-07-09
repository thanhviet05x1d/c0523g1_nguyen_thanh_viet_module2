package ss05_access_modifier_static_getter_setter.quiz;

class MyClassQ4 {
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        MyClassQ4 o = new MyClassQ4();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}

