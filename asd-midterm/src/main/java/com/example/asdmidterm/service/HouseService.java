package com.example.asdmidterm.service;

import com.example.asdmidterm.model.House;

public interface HouseService {
    House addHouse(House house);
    House updateHouse(Integer id, House house);
    House getHouse(Integer id);
    void deleteHouse(Integer id);
}
