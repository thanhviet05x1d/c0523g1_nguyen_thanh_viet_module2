package ss05_access_modifier_static_getter_setter.exercise.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Viet");
        student.setClasses("C05");
        System.out.println("Name: "+student.getName()+" Classes: "+student.getClasses());
    }
}
