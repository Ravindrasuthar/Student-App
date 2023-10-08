package com.ravindra.StudentApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    private long addressId;
    private String addressLandmark;
    private long addressZipcode;
    private String addressDistrict;
    private String addressState;
    private String addressCountry;
}
