package com.ravindra.StudentApp.Service;

import com.ravindra.StudentApp.Model.Address;
import com.ravindra.StudentApp.Model.Student;
import com.ravindra.StudentApp.Repo.IAddressRepo;
import com.ravindra.StudentApp.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IStudentRepo studentRepo;

    @Autowired
    StudentService studentService;

    public String AddAddress(Address address) {
        addressRepo.save(address);
        return "Address added";
    }

    public List<Address> GetAllAddress() {
        return (List<Address>) addressRepo.findAll();
    }

    public Address GetAddressById(long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String UpdateAddress(Address address) {
        List<Address> add = (List<Address>) addressRepo.findAll();
        for(Address ad : add){
            if(ad.getAddressId() == address.getAddressId())
            {
                addressRepo.save(address);
                return "Address updated";
            }
        }
        return "Address can not be updated";
    }

    public String DeleteAddressById(long id) {
        Address address = addressRepo.findById(id).orElseThrow();
        Student student = studentRepo.findByaddress(address);
        if(student!=null)
        {
            long Id = student.getStudentId();
            studentService.DeleteStudentById(Id);
        }
        addressRepo.deleteById(id);
        return "Address deleted";
    }
}
