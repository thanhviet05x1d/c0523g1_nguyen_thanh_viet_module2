package ss05_access_modifier_static_getter_setter.practice.student;

public class Student {
    private int roolno;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
        this.roolno = r;
        this.name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(this.roolno + " " + this.name + " " + this.college);
    }
}
