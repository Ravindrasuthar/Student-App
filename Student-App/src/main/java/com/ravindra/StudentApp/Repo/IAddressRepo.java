package com.ravindra.StudentApp.Repo;

import com.ravindra.StudentApp.Model.Address;
import com.ravindra.StudentApp.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address, Long> {
//    Address findByaddress(Student student);
}
