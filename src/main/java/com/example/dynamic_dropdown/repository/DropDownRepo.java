package com.example.dynamic_dropdown.repository;

import com.example.dynamic_dropdown.entity.DropDown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DropDownRepo extends JpaRepository<DropDown, Long> {
}
