package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.District;
import com.example.dynamic_dropdown.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class DistrictController {
    @Autowired
    DistrictService districtService;

    @GetMapping
    List<District> listOfDistrict(@RequestParam (value = "div_id", required = false) String div_id){
        if (div_id == null){
            return districtService.districtList();
        };
        return districtService.districtListByDivisionId( div_id);
    }
}
