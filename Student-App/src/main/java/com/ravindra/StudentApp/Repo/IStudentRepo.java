package com.ravindra.StudentApp.Repo;

        import com.ravindra.StudentApp.Model.Address;
        import com.ravindra.StudentApp.Model.Course;
        import com.ravindra.StudentApp.Model.Student;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Long> {
    Student findByaddress(Address address);

//    List<Student> findByCourses(List<Course> courses);
}
