package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRep userRep;

    @Autowired
    public UserService(UserRep userRep) {
        this.userRep = userRep;
    }

    public List<User> findAll(){
        return (List<User>) userRep.findAll();
    }

    public User findByName(String name){
        List<User> users = (List<User>) userRep.findAll();
        Optional<User> userOptional = users.stream().filter(user -> user.getName().equals(name)).findFirst();
        if(userOptional.isPresent()){
            return userOptional.get();
        }else {
            throw new NullPointerException("No user with this name");
        }
    }

    public User findById(Long id){
        Optional<User> userOptional = userRep.findById(id);
        if(userOptional.isPresent()){
            return userOptional.get();
        }else {
            throw new NullPointerException("There's no user with this id");
        }
    }

    public User findByEmail(String email)throws Exception{
        List<User> users = (List<User>) userRep.findAll();
        Optional<User> userOptional = users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
        if(userOptional.isPresent()){
            return userOptional.get();
        }else {
            throw  new Exception("No user with this email");
        }
    }

    public void createUser(User user){
        userRep.save(user);
    }

    public void deleteById(Long id){
        userRep.deleteById(id);
    }

}
