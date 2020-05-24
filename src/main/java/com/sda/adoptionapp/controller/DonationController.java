package com.sda.adoptionapp.controller;


import com.sda.adoptionapp.model.Donation;
import com.sda.adoptionapp.model.User;
import com.sda.adoptionapp.service.DonationService;
import com.sda.adoptionapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/donation")
public class DonationController {

    DonationService donationService;
    UserService userService;
    EmailController emailController;

    @Autowired
    public DonationController(DonationService donationService, UserService userService, EmailController emailController) {
        this.donationService = donationService;
        this.userService = userService;
        this.emailController = emailController;
    }

    @GetMapping("/findAll")
    @CrossOrigin("*")
    public List<Donation> findAll() {
        return donationService.findAll();
    }

    @PostMapping("/donate")
    @CrossOrigin("*")
    public void donate(@RequestParam(name = "sum") int sum,
                       @RequestParam(name = "details") String details,
                       @RequestParam(name = "userId") long userId) {
        donationService.donateM(sum, details, userId);
    }



    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable long id) {
        donationService.deleteById(id);
    }
}
