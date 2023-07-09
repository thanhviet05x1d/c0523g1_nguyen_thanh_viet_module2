package ss05_access_modifier_static_getter_setter.quiz;

public class A {
    static public class B {
    }

    public class C {
    }

    public static void main(String[] args) {
//        A.C o = new A.C();
        A.C o = new A().new C();
//        A.B o = new A.B();
    }
}

