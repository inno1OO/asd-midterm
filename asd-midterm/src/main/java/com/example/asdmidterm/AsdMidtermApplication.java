package com.example.asdmidterm;

import com.example.asdmidterm.model.House;
import com.example.asdmidterm.model.Owner;
import com.example.asdmidterm.service.HouseService;
import com.example.asdmidterm.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class AsdMidtermApplication implements CommandLineRunner {
    private OwnerService ownerService;
    private HouseService houseService;


    AsdMidtermApplication(OwnerService ownerService, HouseService houseService){
        this.ownerService = ownerService;
        this.houseService = houseService;

    }

    public static void main(String[] args) {
        SpringApplication.run(AsdMidtermApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
//        var inno = new Owner(null, "Innocent", "Louinord", "10455635" , "IA", null);
//        var savedInno = this.ownerService.addOwner(inno);
//        var house1 = new House(null, "1038 n 4th st", "10 km2", "white", 122343.89, inno);
//        var savedHouse1 = this.houseService.addHouse(house1);

//
        List<House> houses = new ArrayList<>();
        House house1 = new House(null, "Haiti", "20 arcres", "white", 234848.78, null);
        System.out.println(this.houseService.addHouse(house1) + " is saved");
        houses.add(house1);
        Owner inno = new Owner(null, "Louinord", "innocent", "123456", "1000 n 4th st", houses);
        System.out.println(this.ownerService.addOwner(inno) + " is saved");
System.out.println("created");
        ownerService.findAll()
                .stream()
                .sorted(
                        Comparator.comparing(Owner::getPhone)
                )
                .forEach(System.out::println);

    }

}
