package com.ravindra.StudentApp.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Student.class,property="StudentId")
public class Student {

    @Id
    private long StudentId;
    private String StudentName;
    private int studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;

    @OneToOne
    @JoinColumn(name = "fk-address")
    Address address;

    @OneToMany(mappedBy = "student")
    List<Course> Courses;

}
