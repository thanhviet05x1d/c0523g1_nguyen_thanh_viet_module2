package ss08_mvc.service;

import ss08_mvc.model.Student;
import ss08_mvc.repository.IStudentRepository;
import ss08_mvc.repository.StudentRepositoryImpl;

public class IStudentServiceImpl implements IStudentService {
    private IStudentRepository repository=new StudentRepositoryImpl();
    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);

    }
}
