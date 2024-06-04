package com.example.asdmidterm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    @OneToMany(mappedBy = "owner")
    private List<House> houses;

    public static <U extends Comparable<? super U>, T> U getPhone(T t) {
    }
}
