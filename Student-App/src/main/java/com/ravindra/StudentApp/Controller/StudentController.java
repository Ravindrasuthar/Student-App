package com.ravindra.StudentApp.Controller;

import com.ravindra.StudentApp.Model.Student;
import com.ravindra.StudentApp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String AddStudent(@RequestBody Student student)
    {
        return studentService.AddStudent(student);
    }

    @GetMapping("all/student")
    public List<Student> GetAllStudent()
    {
        return studentService.GetAllStudent();
    }

    @GetMapping("student/by/{Id}")
    public Student GetStudentById(@PathVariable long Id)
    {
        return studentService.GetStudentById(Id);
    }

    @PutMapping("student")
    public String UpdateStudent(@RequestBody Student student)
    {
        return studentService.UpdateStudent(student);
    }

    @DeleteMapping("Student/by/{Id}")
    public String DeleteStudentById(@PathVariable long Id)
    {
        return studentService.DeleteStudentById(Id);
    }
}
