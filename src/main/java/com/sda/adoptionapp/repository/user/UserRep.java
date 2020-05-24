package com.sda.adoptionapp.repository.user;

import com.sda.adoptionapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRep extends CrudRepository<User, Long> {
}
