package ss05_access_modifier_static_getter_setter.content;

public class Ss05Content {
    public static void swap(int first, int second){
        int temp =first;
        first=second;
        second=temp;
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
