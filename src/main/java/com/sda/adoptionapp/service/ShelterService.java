package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Shelter;
import com.sda.adoptionapp.repository.ShelterRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    ShelterRep shelterRep;

    @Autowired
    public ShelterService(ShelterRep shelterRep) {
        this.shelterRep = shelterRep;
    }


    public Shelter findById(Long id){
        return shelterRep.findById(id).get();
    }

    public Shelter findByName(String name){
        List<Shelter> shelters = (List<Shelter>) shelterRep.findAll();
        return shelters.stream()
                .filter(shelter -> shelter.getName().equals(name))
                .findFirst().get();
    }

    public void deleteById(Long id){
        shelterRep.deleteById(id);
    }

    public void deleteByEntity(Shelter shelter){
        shelterRep.delete(shelter);
    }

}
