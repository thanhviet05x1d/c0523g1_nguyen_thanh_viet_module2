package ss08_mvc.repository;

import ss08_mvc.model.Student;

public interface IStudentRepository {
    Student[] findAll(); // Phương thức này trả về một mảng kiểu Student ở package "model"
    void addStudent(Student student); // Phương thức này 1 tham số kiểu
}
