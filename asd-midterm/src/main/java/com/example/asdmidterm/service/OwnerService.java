package com.example.asdmidterm.service;

import com.example.asdmidterm.model.Owner;

import java.util.Collection;


public interface OwnerService {
    Owner addOwner(Owner owner);
    Owner updateOwner(Integer id, Owner owner);
    Owner getOwner(Integer id);
    void deleteOwner(Integer id);

    Collection<Object> findAll();
}
