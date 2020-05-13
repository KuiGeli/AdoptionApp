package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Adoption;
import com.sda.adoptionapp.repository.AdoptionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptionService {

    AdoptionRep adoptionRep;

    @Autowired
    public AdoptionService(AdoptionRep adoptionRep) {
        this.adoptionRep = adoptionRep;
    }


    public Adoption findById(Long id){
       return adoptionRep.findById(id).get();
    }

}
