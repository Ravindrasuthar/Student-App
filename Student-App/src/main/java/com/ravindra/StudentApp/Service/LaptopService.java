package com.ravindra.StudentApp.Service;

import com.ravindra.StudentApp.Model.Laptop;
import com.ravindra.StudentApp.Repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String AddLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "Laptop Added";
    }

    public List<Laptop> GetAllLaptop() {
        return (List<Laptop>) laptopRepo.findAll();
    }

    public Laptop GetLaptopById(long id) {
        return laptopRepo.findById(id).orElseThrow();
    }

    public String UpdateLaptop(Laptop laptop) {
        List<Laptop> lap = (List<Laptop>) laptopRepo.findAll();
        for(Laptop l : lap)
        {
            if(l.getLaptopId() == laptop.getLaptopId())
            {
                laptopRepo.save(laptop);
                return "Laptop Updated";
            }
        }
        return "Laptop can not be updated";
    }

    public String DeleteLaptopById(long id) {

        laptopRepo.deleteById(id);
        return "Laptop Deleted";
    }
}
