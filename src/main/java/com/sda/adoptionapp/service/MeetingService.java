package com.sda.adoptionapp.service;

import com.sda.adoptionapp.repository.MeetingRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {

    MeetingRep meetingRep;

    @Autowired
    public MeetingService(MeetingRep meetingRep) {
        this.meetingRep = meetingRep;
    }
}
