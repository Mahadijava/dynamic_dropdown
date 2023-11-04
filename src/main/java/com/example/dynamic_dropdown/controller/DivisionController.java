package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.Division;
import com.example.dynamic_dropdown.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/division")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class DivisionController {

    @Autowired
    DivisionService divisionService;

    @GetMapping
    List<Division> getAlldivisions(){

        return divisionService.getAllDivision();
    }

}
