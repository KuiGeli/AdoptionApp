package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Donation;
import com.sda.adoptionapp.repository.DonationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationService {

    DonationRep donationRep;

    @Autowired
    public DonationService(DonationRep donationRep) {
        this.donationRep = donationRep;
    }

    public Donation findById(Long id){
        return donationRep.findById(id).get();
    }

}
