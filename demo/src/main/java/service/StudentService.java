package service;

import model.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.Optional;


@Service
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Optional<Student> getStudentByDni(String dni) {
        return studentRepository.findById(dni);
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(String dni) {
        studentRepository.deleteById(dni);
    }
}
