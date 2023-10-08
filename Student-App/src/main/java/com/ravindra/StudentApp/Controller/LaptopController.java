package com.ravindra.StudentApp.Controller;

import com.ravindra.StudentApp.Model.Laptop;
import com.ravindra.StudentApp.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String AddLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.AddLaptop(laptop);
    }

    @GetMapping("all/laptop")
    public List<Laptop> GetAllLaptop()
    {
        return laptopService.GetAllLaptop();
    }

    @GetMapping("laptop/by/{Id}")
    public Laptop GetLaptopById(@PathVariable long Id)
    {
        return laptopService.GetLaptopById(Id);
    }

    @PutMapping("laptop")
    public String UpdateLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.UpdateLaptop(laptop);
    }

    @DeleteMapping("laptop/by/{Id}")
    public String DeleteLaptopById(@PathVariable long Id)
    {
        return laptopService.DeleteLaptopById(Id);
    }
}
