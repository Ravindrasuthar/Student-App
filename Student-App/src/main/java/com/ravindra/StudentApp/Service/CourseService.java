package com.ravindra.StudentApp.Service;

import com.ravindra.StudentApp.Model.Book;
import com.ravindra.StudentApp.Model.Course;
import com.ravindra.StudentApp.Model.Laptop;
import com.ravindra.StudentApp.Model.Student;
import com.ravindra.StudentApp.Repo.IBookRepo;
import com.ravindra.StudentApp.Repo.ICourseRepo;
import com.ravindra.StudentApp.Repo.ILaptopRepo;
import com.ravindra.StudentApp.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo courseRepo;

    @Autowired
    IStudentRepo studentRepo;

    @Autowired
    ILaptopRepo laptopRepo;

    @Autowired
    IBookRepo bookRepo;

    public String AddCourse(Course course) {
        courseRepo.save(course);
        return "Course added";
    }

    public List<Course> GetAllCourse() {
        return (List<Course>) courseRepo.findAll();
    }

    public Course GetCourseById(long id) {
        return courseRepo.findById(id).orElseThrow();
    }

    public String UpdateCourse(Course course) {
        List<Course> courses = (List<Course>) courseRepo.findAll();
        for(Course course1 : courses)
        {
            if(course1.getCourseId() == course.getCourseId())
            {
                courseRepo.save(course);
                return "Course updated";
            }
        }
        return "Course can not be updated";
    }

    public String DeleteCourse(List<Long> id){

//        List<Course> courses = (List<Course>) courseRepo.findAllById(id);
//        List<Student> students = studentRepo.findByCourses(courses);
//        if(!students.isEmpty()) {
//            for (Student s : students){
//
//                Laptop laptop = laptopRepo.findByStudent(s);
//                if(laptop!=null)
//                {
//                    laptopRepo.delete(laptop);
//                }
//
//                List<Book> books = bookRepo.findByStudent(s);
//                if(!books.isEmpty()){
//                    for(Book b : books)
//                    {
//                        bookRepo.delete(b);
//                    }
//                }
//                studentRepo.delete(s);
//            }
//        }
        courseRepo.deleteAllById(id);
        return "Courses deleted";
    }
}
