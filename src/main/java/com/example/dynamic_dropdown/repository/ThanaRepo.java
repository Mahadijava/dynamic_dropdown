package com.example.dynamic_dropdown.repository;

import com.example.dynamic_dropdown.entity.Thana;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThanaRepo extends JpaRepository<Thana, String > {
    List<Thana> getAllThanaByDistrictId(String districtId);
}
