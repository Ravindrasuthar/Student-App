package com.ravindra.StudentApp.Repo;

import com.ravindra.StudentApp.Model.Book;
import com.ravindra.StudentApp.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepo extends CrudRepository<Book, Long> {
    List<Book> findByStudent(Student student);
}
