package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    @PostMapping("/create")
    public void createStaff(@RequestBody Staff s){
        staffRepository.insert(s);
    }
    @PostMapping("/delete/{id}")
    public void deleteStaff(@PathVariable String id){
        staffRepository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Staff> listStaff(){
        return staffRepository.findAll();
    }

}
