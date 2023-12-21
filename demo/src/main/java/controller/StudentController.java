package controller;
import model.Student;
import org.springframework.web.bind.annotation.*;
import service.IStudentService;
@RestController
@RequestMapping("/students")
public class StudentController {

    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping("/getAll")
    public Iterable<Student> getAllStudents() {
        return iStudentService.getAllStudents();
    }

    @GetMapping("/{dni}")
    public Student getStudentByDni(@PathVariable String dni) {
        return iStudentService.getStudentByDni(dni).orElse(null);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return iStudentService.saveStudent(student);
    }

    @PutMapping("/{dni}")
    public Student updateStudent(@PathVariable String dni, @RequestBody Student student) {
        student.setDni(dni);
        return iStudentService.saveStudent(student);
    }

    @DeleteMapping("/{dni}")
    public void deleteStudent(@PathVariable String dni) {
        iStudentService.deleteStudent(dni);
    }
}
