package com.example.dynamic_dropdown.repository;

import com.example.dynamic_dropdown.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepositiry extends JpaRepository<District, String> {
    List<District> findAllByDivisionId(String divId);
}
