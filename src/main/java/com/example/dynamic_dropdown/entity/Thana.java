package com.example.dynamic_dropdown.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Thana {
    @Id
    private String id;

    private String thana;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_id")
    @JsonBackReference
    private District district;

}
