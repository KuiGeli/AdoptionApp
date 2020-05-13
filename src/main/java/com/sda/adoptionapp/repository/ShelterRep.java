package com.sda.adoptionapp.repository;

import com.sda.adoptionapp.model.Shelter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRep extends CrudRepository<Shelter, Long> {
}
