package com.example.asdmidterm.service.impl;

import com.example.asdmidterm.model.Owner;
import com.example.asdmidterm.repository.OwnerRepository;
import com.example.asdmidterm.service.OwnerService;

public class OwnerServiceImpl implements OwnerService {
    private OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner addOwner(Owner owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Integer id, Owner owner) {
        Owner savedOwner = this.getOwner(id);
        if (savedOwner != null) {
            return this.ownerRepository.save(owner);
        }
        return null;
    }

    @Override
    public Owner getOwner(Integer id) {
        return this.ownerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteOwner(Integer id){
        this.ownerRepository.deleteById(id);
    }
}
