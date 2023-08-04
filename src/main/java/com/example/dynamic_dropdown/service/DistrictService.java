package com.example.dynamic_dropdown.service;

import com.example.dynamic_dropdown.entity.District;
import com.example.dynamic_dropdown.repository.DistrictRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    DistrictRepositiry districtRepositiry;

    public List<District> districtList(){
        return districtRepositiry.findAll();
    }
}
