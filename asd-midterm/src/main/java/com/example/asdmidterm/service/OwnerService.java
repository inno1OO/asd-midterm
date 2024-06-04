package com.example.asdmidterm.service;

import com.example.asdmidterm.model.Owner;
import org.springframework.data.relational.core.sql.In;

public interface OwnerService {
    Owner addOwner(Owner owner);
    Owner updateOwner(Integer id, Owner owner);
    Owner getOwner(Integer id);
    void deleteOwner(Integer id);
}
