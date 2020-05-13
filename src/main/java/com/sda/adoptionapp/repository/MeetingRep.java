package com.sda.adoptionapp.repository;

import com.sda.adoptionapp.model.Meeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRep extends CrudRepository<Meeting, Long> {
}
