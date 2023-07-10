package ss05_access_modifier_static_getter_setter.content.unit11;

class Frog2 {
    private static int frogCount = 0; // static variable

    static int getFrogCount() { // static method
        return frogCount;
    }

    public Frog2() {
        frogCount++;
    }
}

class TestFrog {
    void go() {
        System.out.println("from inst " + Frog2.getFrogCount()); // instance context
    }

    public static void main(String[] args) {
        new Frog2();
        new Frog2();
        new Frog2();
        System.out.println("from static " + Frog2.getFrogCount()); // Use static context
        new Frog2();
        new TestFrog().go();
        Frog2 f = new Frog2();
        System.out.println("use ref var " + f.getFrogCount()); // Use ref var, không nên dùng
    }
}

