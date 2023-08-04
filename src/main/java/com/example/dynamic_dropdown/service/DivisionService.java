package com.example.dynamic_dropdown.service;

import com.example.dynamic_dropdown.entity.Division;
import com.example.dynamic_dropdown.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    public List <Division> getAllDivision(){
        return divisionRepository.findAll();
    }
}
