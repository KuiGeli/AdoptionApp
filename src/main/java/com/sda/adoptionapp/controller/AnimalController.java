package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.model.Animal;
import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/animal")
public class AnimalController {

    AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @GetMapping("/sayhi/{hi}")
    public String sayHi(@PathVariable String hi) {
        return hi + " you fucking ANIMAL!!!";
    }

    @GetMapping("/findAll")
    @CrossOrigin("*")
    public List<Animal> findAnimals() {
        return animalService.findAll();
    }

    @GetMapping("/findBySex/{sex}")
    public List<Animal> findBySex(@PathVariable String sex) {
        return animalService.findBySex(sex);
    }


}
