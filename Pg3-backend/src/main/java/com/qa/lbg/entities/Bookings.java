package com.qa.lbg.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    //    @Column(name = "full_name", nullable = false, unique = true)
    private int propertyId ;

    private int buyerId;

    private LocalDateTime date;

    public Bookings() {
    }

    public Bookings(Integer bookingId, int propertyId, int buyerId, LocalDateTime date) {
        this.bookingId = bookingId;
        this.propertyId = propertyId;
        this.buyerId = buyerId;
        this.date = date;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "Booking Id=" + bookingId +
                ", Property Id=" + propertyId +
                ", Buyer Id=" + buyerId +
                ", Date=" + date +
                '}';
    }
}