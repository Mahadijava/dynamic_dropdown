package com.example.dynamic_dropdown.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DropDown {
    @Id
    private Long id;
    private String district;
    private String division;
    private String thana;

}
