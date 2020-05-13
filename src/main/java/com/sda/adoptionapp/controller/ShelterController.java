package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.model.Shelter;
import com.sda.adoptionapp.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shelter")
public class ShelterController {

    ShelterService shelterService;

    @Autowired
    public ShelterController(ShelterService shelterService) {
        this.shelterService = shelterService;
    }

    @GetMapping("/findById/{id}")
    public Shelter findById(@PathVariable Long id){
        return shelterService.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public Shelter findByName(@PathVariable String name){
        return shelterService.findByName(name);
    }

    @DeleteMapping("/deleteBuId/{id}")
    public void deleteById(@PathVariable Long id){
        shelterService.deleteById(id);
    }

    @DeleteMapping("/deleteByName/{name}")
    public void deleteByName(@PathVariable String name){
        shelterService.findByName(name);
    }

}
