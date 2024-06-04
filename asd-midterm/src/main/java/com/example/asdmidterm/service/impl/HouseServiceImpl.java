package com.example.asdmidterm.service.impl;

import com.example.asdmidterm.model.House;
import com.example.asdmidterm.repository.HouseRepository;
import com.example.asdmidterm.service.HouseService;

public class HouseServiceImpl implements HouseService {
    private HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository){
        this.houseRepository = houseRepository;
    }

    @Override
    public House addHouse(House house){
        return  this.houseRepository.save(house);
    }
    @Override
    public House updateHouse(Integer id, House house) {
        House savedHouse = this.getHouse(id);
        if(savedHouse != null){
            return this.houseRepository.save(house);
        }

        return null;
    }

    @Override
    public House getHouse(Integer id) {
        return this.houseRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteHouse(Integer id) {
        this.houseRepository.deleteById(id);
    }
}

