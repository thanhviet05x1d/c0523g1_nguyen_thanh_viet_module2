package ss06_ke_thua.unit5_overiding_overloading;
//

//
//class B {
//    public void p(double number) {
//        System.out.println(number * 2);
//    }
//}
//
//class A extends B {
//    public void p(double number) {
//        System.out.println(number);
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        A a = new A();
//        a.p(10);
//        a.p(10.0);
//    }
//}


class B {
    public void p(double number) {
        System.out.println(number * 2);
    }
}
class A extends B{
    public void p(int number){
        System.out.println(number);
    }
}
public class Test{
    public static void main(String[] args) {
        A a=new A();
        a.p(10);
        a.p(11.0);
    }
}
