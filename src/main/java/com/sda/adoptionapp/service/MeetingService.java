package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Meeting;
import com.sda.adoptionapp.repository.MeetingRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {

    private MeetingRep meetingRep;

    @Autowired
    public MeetingService(MeetingRep meetingRep) {
        this.meetingRep = meetingRep;
    }

    public void save(Meeting meeting){
        meetingRep.save(meeting);
    }

    public List<Meeting> findAll() {
        return (List<Meeting>) meetingRep.findAll();
    }

    public void deleteById(Long id){
        meetingRep.deleteById(id);
    }
}
