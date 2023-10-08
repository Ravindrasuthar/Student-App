package com.ravindra.StudentApp.Repo;

import com.ravindra.StudentApp.Model.Course;
import com.ravindra.StudentApp.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICourseRepo extends CrudRepository<Course,Long> {
    List<Course> findByStudent(Student student);
}
