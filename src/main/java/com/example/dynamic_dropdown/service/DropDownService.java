package com.example.dynamic_dropdown.service;

import com.example.dynamic_dropdown.entity.DropDown;
import com.example.dynamic_dropdown.repository.DropDownRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DropDownService {
    DropDownRepo dropDownRepository;

    public List<DropDown> dropDownList(){
        return dropDownRepository.findAll();
    }

    public void save(DropDown dropDown){
        dropDownRepository.save(dropDown);
    }
}
