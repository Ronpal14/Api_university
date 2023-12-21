package service;

import model.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IStudentService {

        Iterable<Student> getAllStudents();

        Optional<Student> getStudentByDni(String dni);

        Student saveStudent(Student student);

        void deleteStudent(String dni);
}


