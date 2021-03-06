package com.sda.adoptionapp.repository;


import com.sda.adoptionapp.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRep extends CrudRepository<Animal, Long> {
}
