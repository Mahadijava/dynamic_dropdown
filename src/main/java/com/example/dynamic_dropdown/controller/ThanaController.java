package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.Thana;
import com.example.dynamic_dropdown.service.ThanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/thana/")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class ThanaController {
    @Autowired
    ThanaService thanaService;

    @GetMapping("thanalist")
    List<Thana> listOfThana(){
        return thanaService.thanaList();
    }
}
