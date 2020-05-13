package com.sda.adoptionapp.repository;

import com.sda.adoptionapp.model.Donation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRep extends CrudRepository<Donation, Long> {
}
