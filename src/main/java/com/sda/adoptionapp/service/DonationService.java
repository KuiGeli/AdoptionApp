package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Donation;
import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.repository.DonationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {

    DonationRep donationRep;
    UserService userService;

    @Autowired
    public DonationService(DonationRep donationRep, UserService userService) {
        this.donationRep = donationRep;
        this.userService = userService;
    }

    public Donation findById(Long id){
        return donationRep.findById(id).get();
    }

    public void save(Donation donation){
        donationRep.save(donation);
    }

    public List<Donation> findAll(){
        return (List<Donation>) donationRep.findAll();
    }

    public void deleteById(Long id){
        donationRep.deleteById(id);
    }

    public void donateM(int sum,  String details, long userId) {
        User user = userService.findById(userId);
        Donation donation = new Donation();
        donation.setUser(user);
        donation.setDetails(details);
        donation.setSum(sum);
        save(donation);
    }

}
