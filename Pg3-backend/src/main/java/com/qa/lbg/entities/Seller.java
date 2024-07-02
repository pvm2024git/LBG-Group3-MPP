package com.qa.lbg.entities;

import jakarta.persistence.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sellerId;

//    @Column(name = "first_name", nullable = false, unique = true)
    private String firstName;

    private String surname;

    public Seller() {}

    public Seller(Integer sellerId, String firstName, String surname) {
        this.sellerId = sellerId;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
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
                "Seller Id=" + sellerId +
                ", First Name='" + firstName + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }
}
