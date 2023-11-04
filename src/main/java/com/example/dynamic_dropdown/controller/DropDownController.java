package com.example.dynamic_dropdown.controller;

import com.example.dynamic_dropdown.entity.DropDown;
import com.example.dynamic_dropdown.service.DropDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dropdown/")
@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class DropDownController {
    @Autowired
    DropDownService dropDownService;

    @PostMapping("post")
    public void save(@RequestBody DropDown dropDown){
        dropDownService.save(dropDown);
    }

    List<DropDown> listOfDropDown(){
        return dropDownService.dropDownList();
    }


}
