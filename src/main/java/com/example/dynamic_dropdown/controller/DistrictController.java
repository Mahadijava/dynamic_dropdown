package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.District;
import com.example.dynamic_dropdown.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/district/")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class DistrictController {
    @Autowired
    DistrictService districtService;

    @GetMapping("districtlist")
    List<District> listOfDistrict(){
        return districtService.districtList();
    }
}
