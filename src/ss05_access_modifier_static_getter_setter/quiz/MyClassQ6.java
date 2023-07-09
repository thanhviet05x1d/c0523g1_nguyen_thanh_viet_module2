package ss05_access_modifier_static_getter_setter.quiz;
class ChuNhat {
    public int rong, dai;

    public ChuNhat(int rong, int dai) {
        this.rong = rong;
        this.dai = dai;
    }
}
public class MyClassQ6 {
    void method(ChuNhat x) {
        x.rong = 5;
        x.dai = 5;
    }

    public static void main(String[] args) {
        MyClassQ6 o = new MyClassQ6();
        ChuNhat cn = new ChuNhat(1, 1);
        o.method(cn);
        System.out.printf("x=%d, y=%d", cn.rong, cn.dai);
    }
}
