package com.example.dynamic_dropdown.repository;

import com.example.dynamic_dropdown.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository <Division, String> {
}
