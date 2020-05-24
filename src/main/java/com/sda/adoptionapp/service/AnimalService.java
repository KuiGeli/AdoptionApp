package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Animal;
import com.sda.adoptionapp.repository.AnimalRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private AnimalRep animalRep;


    @Autowired
    public AnimalService(AnimalRep animalRep) {
        this.animalRep = animalRep;
//        Animal animal = new Animal();
//        animal.setSex("Male");
//        animal.setAge(3);
//        animal.setRace("Cat");
//        animal.setDetails("Wild");
//
//        animalRep.save(animal);

    }

    public List<Animal> findAll(){
        return (List<Animal>) animalRep.findAll();
    }

    public List<Animal> findBySex(String sex){
        List<Animal> animals = (List<Animal>) animalRep.findAll();
        return animals.stream()
                .filter(anim -> anim.getSex().equals(sex))
                .collect(Collectors.toList());
    }

    public Animal findById(Long id){
        return animalRep.findById(id).orElseThrow(() -> new NullPointerException("Does not exist!!"));
    }

    public void save(Animal animal){
        animalRep.save(animal);
    }

    public void delete(Animal animal){
        animalRep.delete(animal);
    }

    public void deleteById(Long id){
        animalRep.deleteById(id);
    }

    public void deleteAll(){
        animalRep.deleteAll();
    }



}
