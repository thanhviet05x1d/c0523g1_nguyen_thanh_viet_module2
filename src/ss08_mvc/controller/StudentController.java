package ss08_mvc.controller;

import ss08_mvc.model.Student;
import ss08_mvc.service.IStudentService;
import ss08_mvc.service.IStudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static IStudentService service = new IStudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println(" --- Student Manager ---");
            System.out.println("1. List");
            System.out.println("2. Create");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1: // list
                    Student[] studentList = service.findAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2: // create
                    System.out.println("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inout name:");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    service.addStudent(student);
                    break;
                case 3:
                    break;
                case 9:
                    System.exit(0);
            }
        }
        while (true);
    }
}
