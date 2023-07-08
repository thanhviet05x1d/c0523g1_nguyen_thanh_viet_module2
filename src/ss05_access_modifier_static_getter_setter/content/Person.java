package ss05_access_modifier_static_getter_setter.content;

public class Person {
    public String name;  // Gọi là biến thành viên của lớp hoặc thuộc tính của lớp đều được

    public Person(String name) {
        this.name = name;
    }

    public static void swap(Person first, Person second) {
        String temp = first.name;
        first.name = second.name;
        second.name = temp;
    }

    public static void main(String[] args) {
        Person a = new Person("John");
        Person b = new Person("Bill");
        swap(a, b);// hoặc a.swap(a, b);
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}
