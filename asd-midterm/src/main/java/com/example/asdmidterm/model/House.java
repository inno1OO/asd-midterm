package com.example.asdmidterm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "house")
@Entity
public class House {
    @Id
    @GeneratedValue
    private Integer id;
    private String address;
    private String size;
    private String color;
    private Double price;
    @ManyToOne(cascade = CascadeType.ALL)
    private Owner owner;
}
