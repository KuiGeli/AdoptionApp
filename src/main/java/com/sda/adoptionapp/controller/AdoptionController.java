package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.service.AdoptionService;
import com.sda.adoptionapp.service.AnimalService;
import com.sda.adoptionapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    AdoptionService adoptionService;
    UserService userService;
    AnimalService animalService;
    EmailController emailController;

    @Autowired
    public AdoptionController(AdoptionService adoptionService, UserService userService, AnimalService animalService, EmailController emailController) {
        this.adoptionService = adoptionService;
        this.userService = userService;
        this.animalService = animalService;
        this.emailController = emailController;
    }

    @PostMapping("/createAdoption")
    @CrossOrigin("*")
    public void createAdoption(@RequestParam(name = "idUser") Long idUser,
                               @RequestParam(name = "idAnimal") Long idAnimal){
        adoptionService.createAdoption(idUser, idAnimal);
    }



}
