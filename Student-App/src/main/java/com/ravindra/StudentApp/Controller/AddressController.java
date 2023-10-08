package com.ravindra.StudentApp.Controller;


import com.ravindra.StudentApp.Model.Address;
import com.ravindra.StudentApp.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String AddAddress(@RequestBody Address address)
    {
        return addressService.AddAddress(address);
    }

    @GetMapping("all/address")
    public List<Address> GetAllAddress()
    {
        return addressService.GetAllAddress();
    }

    @GetMapping("address/by/{Id}")
    public Address GetAddressById(@PathVariable long Id)
    {
        return addressService.GetAddressById(Id);
    }

    @PutMapping("address")
    public String UpdateAddress(@RequestBody Address address)
    {
        return addressService.UpdateAddress(address);
    }

    @DeleteMapping("address/by/{Id}")
    public String DeleteAddressById(@PathVariable long Id)
    {
        return addressService.DeleteAddressById(Id);
    }
}
