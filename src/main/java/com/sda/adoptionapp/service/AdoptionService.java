package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Adoption;
import com.sda.adoptionapp.repository.AdoptionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

@Service
public class AdoptionService {

    AdoptionRep adoptionRep;
    AnimalService animalService;
    UserService userService;

    @Autowired
    public AdoptionService(AdoptionRep adoptionRep, AnimalService animalService, UserService userService) {
        this.adoptionRep = adoptionRep;
        this.animalService = animalService;
        this.userService = userService;
    }

    public Adoption findById(Long id){
       return adoptionRep.findById(id).get();
    }

    public void save(Adoption adoption){
        adoptionRep.save(adoption);
    }

    public List<Adoption> findAll(){
        return (List<Adoption>) adoptionRep.findAll();
    }

    public void deleteById(Long id){
        adoptionRep.deleteById(id);

    }

    public void createAdoption( Long idUser, Long idAnimal) {
        Adoption adoption = new Adoption();
        adoption.setDate(new Date(Calendar.getInstance().getTime().getTime()));
        adoption.setUser(userService.findById(idUser));
        adoption.setAnimal(animalService.findById(idAnimal));
        save(adoption);
    }

}
