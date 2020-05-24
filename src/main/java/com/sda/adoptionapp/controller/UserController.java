package com.sda.adoptionapp.controller;


import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findById")
    public User findById(@RequestParam(name = "id") long id){
        return userService.findById(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }




}
