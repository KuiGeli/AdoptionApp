package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.model.Animal;
import com.sda.adoptionapp.service.AnimalService;
import com.sda.adoptionapp.service.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/animal")
public class AnimalController {

    AnimalService animalService;
    ShelterService shelterService;

    @Autowired
    public AnimalController(AnimalService animalService, ShelterService shelterService) {
        this.animalService = animalService;
        this.shelterService = shelterService;
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

    @PostMapping("/addAnimal")
    @CrossOrigin("*")
    public void addAnimal(@RequestParam(name = "age") int age,
                          @RequestParam(name = "sex") String sex,
                          @RequestParam(name = "race") String race,
                          @RequestParam(name = "details") String details,
                          @RequestParam(name = "photo") String photo) {

        Animal animal = new Animal();
        animal.setAge(age);
        animal.setSex(sex);
        animal.setRace(race);
        animal.setDetails(details);
        animal.setPhoto(photo);
        animal.setShelter(shelterService.findAll().get(0));

        animalService.save(animal);

    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin("*")
    public void delete(@PathVariable Long id) {
        animalService.deleteById(id);
    }


}
