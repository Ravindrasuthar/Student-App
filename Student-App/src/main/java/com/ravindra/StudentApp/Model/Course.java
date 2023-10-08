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
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Course.class,property="courseId")
public class Course {

    @Id
    private long courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

      @ManyToOne
      @JoinColumn(name = "fk-student-id")
      Student student;
}
