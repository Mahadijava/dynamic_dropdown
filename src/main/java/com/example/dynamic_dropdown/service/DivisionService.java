package com.example.dynamic_dropdown.service;

import com.example.dynamic_dropdown.entity.Division;
import com.example.dynamic_dropdown.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    public List <Division> getAllDivision(){
        List<Division> listOfDivision = new ArrayList<>();

        for (Division d: divisionRepository.findAll() ) {
            d.setDistricts(null); // removing district child
            listOfDivision.add(d); // new list of division

        }
        return listOfDivision;
    }
}
