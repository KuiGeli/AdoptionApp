package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.service.DataBasePopulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manage")
public class ManagementController {

    DataBasePopulation dataBasePopulation;

    @Autowired
    public ManagementController(DataBasePopulation dataBasePopulation) {
        this.dataBasePopulation = dataBasePopulation;
    }

    @PostMapping("/populateData")
    public void saveData(){
        dataBasePopulation.populateData();
    }




}
