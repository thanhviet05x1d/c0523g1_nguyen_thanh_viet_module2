package ss08_mvc.service;

import ss08_mvc.model.Student;

public interface IStudentService {
    /* CRUD = Create + Read + Update + Delete*/
    Student[] findAll();
    void addStudent(Student student);
    /* Validation = Phần xác nhận thông tin */

}
