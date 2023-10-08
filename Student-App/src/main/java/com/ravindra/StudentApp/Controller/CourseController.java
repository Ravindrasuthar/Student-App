package com.ravindra.StudentApp.Controller;

import com.ravindra.StudentApp.Model.Course;
import com.ravindra.StudentApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String AddCourse(@RequestBody Course course)
    {
        return courseService.AddCourse(course);
    }

    @GetMapping("all/course")
    public List<Course> GetAllCourse()
    {
        return courseService.GetAllCourse();
    }

    @GetMapping("course/by/{Id}")
    public Course GetCourseById(@PathVariable long Id)
    {
        return courseService.GetCourseById(Id);
    }

    @PutMapping("course")
    public String UpdateCourse(@RequestBody Course course)
    {
        return courseService.UpdateCourse(course);
    }

    @DeleteMapping("course/by/{Id}")
    public String DeleteCourse(@PathVariable List<Long> Id)
    {
        return courseService.DeleteCourse(Id);
    }
}
