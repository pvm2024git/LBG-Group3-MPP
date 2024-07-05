package com.qa.lbg.entities;

import jakarta.persistence.*;

@Entity
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    //    @Column(name = "full_name", nullable = false, unique = true)
    private String firstName;

    private String surname;

    public Bookings() {}

    public Bookings(Integer bookingId, String firstName, String surname) {
        this.bookingId = bookingId;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Integer getBuyerId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
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
                "Booking Id=" + bookingId +
                ", First Name='" + firstName + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }
}