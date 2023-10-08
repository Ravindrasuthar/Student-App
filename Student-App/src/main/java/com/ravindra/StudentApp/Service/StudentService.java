package com.ravindra.StudentApp.Service;

import com.ravindra.StudentApp.Model.*;
import com.ravindra.StudentApp.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    @Autowired
    ICourseRepo courseRepo;

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    ILaptopRepo laptopRepo;

    @Autowired
    IBookRepo bookRepo;

    public String AddStudent(Student student) {
        studentRepo.save(student);
        return "Student added";
    }

    public List<Student> GetAllStudent() {
        return (List<Student>) studentRepo.findAll();
    }

    public Student GetStudentById(long id) {
        return studentRepo.findById(id).orElseThrow();
    }

    public String UpdateStudent(Student student) {
        List<Student> std = (List<Student>) studentRepo.findAll();
        for(Student s : std)
        {
            if(s.getStudentId() == student.getStudentId())
            {
                studentRepo.save(student);
                return "Student Updated";
            }
        }
        return "Student not found";
    }

    public String DeleteStudentById(long id) {
        Student student = studentRepo.findById(id).orElseThrow();

        List<Course> courses = courseRepo.findByStudent(student);
        if(!courses.isEmpty()) {
            for (Course cou : courses) {
                courseRepo.delete(cou);
            }
        }

        Laptop laptop = laptopRepo.findByStudent(student);
        if(laptop!=null)
        {
            laptopRepo.delete(laptop);
        }

        List<Book> books = bookRepo.findByStudent(student);
        if(!books.isEmpty()){
            for(Book b : books)
            {
                bookRepo.delete(b);
            }
        }
        studentRepo.deleteById(id);
        return "Student Deleted";
    }
}
