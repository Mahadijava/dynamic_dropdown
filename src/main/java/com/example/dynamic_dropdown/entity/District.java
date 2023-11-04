package com.example.dynamic_dropdown.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
  @JsonBackReference
    private Division division;

  @OneToMany(mappedBy = "district", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonManagedReference
   private List<Thana> thanas = new ArrayList<>();


}
