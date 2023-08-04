package com.example.dynamic_dropdown.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Division {
    @Id
    private String id;
    private String division;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<District> districts = new ArrayList<>();


}





