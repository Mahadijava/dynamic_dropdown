package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.Thana;
import com.example.dynamic_dropdown.service.ThanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/thana")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class ThanaController {
    @Autowired
    ThanaService thanaService;

    @GetMapping
    List<Thana> listOfThana(@RequestParam(value = "district_id", required = false) String district_id){
        if (district_id == null){
            return thanaService.thanaList(); // it will show all thana of the database
        };
        return thanaService.getAllThanaByDistrictId(district_id);
    }
}
