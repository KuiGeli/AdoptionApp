package com.sda.adoptionapp.model;


import javax.persistence.*;

@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private float sum;

    @Column
    private String details;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user_donation")
    User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}
