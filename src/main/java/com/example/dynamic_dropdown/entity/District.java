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
public class District {
    @Id
    private String id;
    private String district;

  @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "division_id")
    private Division division;

  @OneToMany(mappedBy = "district", cascade = CascadeType.ALL, orphanRemoval = true)
   private List<Thana> thanas = new ArrayList<>();


}
