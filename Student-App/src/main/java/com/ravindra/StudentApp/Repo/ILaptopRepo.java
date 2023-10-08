package com.ravindra.StudentApp.Repo;

import com.ravindra.StudentApp.Model.Laptop;
import com.ravindra.StudentApp.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends CrudRepository<Laptop, Long> {
    Laptop findByStudent(Student student);
}
