package com.danielrrapi.U5W1D5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "booking_date")
    private LocalDate bookingDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;

    public Reservation() {
    }

    public Reservation(LocalDate bookingDate, User user, Workstation workstation) {
        this.bookingDate = bookingDate;
        this.user = user;
        this.workstation = workstation;
    }

    public long getId() {
        return id;
    }


    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Workstation getWorkstation() {
        return workstation;
    }

    public void setWorkstation(Workstation workstation) {
        this.workstation = workstation;
    }

}
