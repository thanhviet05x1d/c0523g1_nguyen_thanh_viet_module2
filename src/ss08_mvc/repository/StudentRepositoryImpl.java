package ss08_mvc.repository;

import ss08_mvc.model.Student;

public class StudentRepositoryImpl implements IStudentRepository {
    // connect Database (sau này sẽ kết nối Database)
    private static Student[] studentList;
    private static int size = 0;

    static {
        studentList = new Student[10];
        studentList[0] = new Student(1, "Hanh");
        studentList[1] = new Student(2, "Long");
        studentList[2] = new Student(3, "Hau");
        studentList[3] = new Student(4, "Duy");
        size = 4;
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentList[size] = student;
        size++;
    }
}
