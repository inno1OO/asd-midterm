package com.example.asdmidterm;

import com.example.asdmidterm.model.House;
import com.example.asdmidterm.model.Owner;
import com.example.asdmidterm.service.HouseService;
import com.example.asdmidterm.service.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsdMidtermApplication implements CommandLineRunner {
    private OwnerService ownerService;
    private HouseService houseService;

    AsdMidtermApplication(OwnerService ownerService1, HouseService houseService1){
        this.ownerService = ownerService1;
        this.houseService = houseService1;
    }

    public static void main(String[] args) {
        SpringApplication.run(AsdMidtermApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
//        var inno = new Owner("Louinord", "Innocent", "123456", "1000 n4th st, fairfield , IA", null);
//        var savedInno = this.ownerService.addOwner(inno);

        Owner inno = new Owner(null, "Louinord", "innocent", "123456", "1000 n 4th st", null);
        System.out.println(this.ownerService.addOwner(inno) + " is saved");

//        House house1 = new House(null, "Haiti", "20 arcres", "white", 234848.78, inno);
    }

}
