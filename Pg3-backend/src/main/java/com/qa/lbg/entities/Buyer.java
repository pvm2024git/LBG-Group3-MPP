package com.qa.lbg.entities;

import jakarta.persistence.*;

@Entity
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buyerId;

//    @Column(name = "full_name", nullable = false, unique = true)
    private String firstName;

    private String surname;

    public Buyer() {}

    public Buyer(Integer buyerId, String firstName, String surname) {
        this.buyerId = buyerId;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Buyer Id=" + buyerId +
                ", First Name='" + firstName + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }
}
