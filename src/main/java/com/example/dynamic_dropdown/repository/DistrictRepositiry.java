package com.example.dynamic_dropdown.repository;

import com.example.dynamic_dropdown.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepositiry extends JpaRepository<District, String> {
}
