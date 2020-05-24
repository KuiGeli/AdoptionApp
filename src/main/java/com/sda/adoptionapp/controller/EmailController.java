package com.sda.adoptionapp.controller;

import com.sda.adoptionapp.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    EmailServiceImpl emailService;

    @Autowired
    public EmailController(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

//    @PutMapping("/send")
//    @CrossOrigin("*")
//    public void sendMail(@RequestParam(name = "email") String email,
//                         @RequestParam(name = "subject") String subject,
//                         @RequestParam(name = "text") String text){
//        emailService.sendSimpleMessage(email, subject, text);
//    }

    @PutMapping("/send/{email}/{subject}/{text}")
    @CrossOrigin("*")
    public void sendMail(@PathVariable String email,
                         @PathVariable String subject,
                         @PathVariable String text){
        emailService.sendSimpleMessage(email, subject, text);
    }


}
