package com.sda.adoptionapp.repository.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class userRepositoryImpl implements UserInterface {

    UserRep userRep;

    @Autowired
    public userRepositoryImpl(UserRep userRep) {
        this.userRep = userRep;
    }
}
