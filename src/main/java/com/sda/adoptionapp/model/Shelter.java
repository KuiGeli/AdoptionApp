package com.sda.adoptionapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

    @OneToMany(mappedBy = "shelter", fetch = FetchType.LAZY)
    List<Animal> animals = new ArrayList<>();

    @OneToMany(mappedBy = "shelter", fetch = FetchType.LAZY)
    List<User> users = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
