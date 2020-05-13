package com.sda.adoptionapp.controller;


import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findByName/{name}")
    public User findByName(@PathVariable String name){
    return userService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }




}
