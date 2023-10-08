package com.ravindra.StudentApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Laptop {

    @Id
    private long laptopId;
    private String laptopName;
    private String laptopBrand;
    private long laptopPrice;

    @OneToOne
    @JoinColumn(name = "fk-student")
    Student student;
}
