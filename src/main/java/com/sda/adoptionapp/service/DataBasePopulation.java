package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class DataBasePopulation {

    @Autowired
    AdoptionService adoptionService;
    @Autowired
    AnimalService animalService;
    @Autowired
    ContractService contractService;
    @Autowired
    DonationService donationService;
    @Autowired
    MeetingService meetingService;
    @Autowired
    ShelterService shelterService;
    @Autowired
    UserService userService;


    public void populateData(){

        Animal animal = new Animal();
        Shelter shelter = new Shelter();
        User user = new User();
        Donation donation = new Donation();
        Meeting meeting = new Meeting();
        Adoption adoption = new Adoption();
        Contract contract = new Contract();

        animal.setRace("Cat");
        animal.setAge(2);
        animal.setSex("Male");
        animal.setDetails("Wild");
        animal.setShelter(shelter);

        shelter.setName("AnimalShelter");
        shelter.getAnimals().add(animal);
        shelter.getUsers().add(user);
        shelter.setAddress("Mars");

        user.setName("Wendy");
        user.setEmail("Wendy@email.com");
        user.setShelter(shelter);

        donation.setSum(100.000F);
        donation.setUser(user);
        donation.setDetails("Charity");

        meeting.setAddress("Moon");
        meeting.setAnimal(animal);
        meeting.setUser(user);


        adoption.setAnimal(animal);
        adoption.setUser(user);
        adoption.setDate(Date.valueOf(LocalDate.now().plusMonths(2)));
        adoption.setDetails("She's suitable");

        contract.setAdoption(adoption);

        shelterService.save(shelter);
        animalService.save(animal);
        userService.save(user);
        donationService.save(donation);
        meetingService.save(meeting);
        adoptionService.save(adoption);
        contractService.save(contract);


    }




}
