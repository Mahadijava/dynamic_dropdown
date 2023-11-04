package com.example.dynamic_dropdown.service;

import com.example.dynamic_dropdown.entity.Thana;
import com.example.dynamic_dropdown.repository.ThanaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanaService {
    @Autowired
    ThanaRepo thanaRepository;

    public List<Thana> thanaList(){
        return thanaRepository.findAll();
    }

    public List<Thana> getAllThanaByDistrictId(String district_id){
        return thanaRepository.getAllThanaByDistrictId(district_id);
    }
}
