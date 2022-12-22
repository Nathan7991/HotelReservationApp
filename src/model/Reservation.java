package model;

import java.time.LocalDate;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private LocalDate checkInDate;
    private LocalDate getCheckOutDate;

    public Reservation(Customer customer, IRoom room, LocalDate checkInDate, LocalDate getCheckOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.getCheckOutDate = getCheckOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public IRoom getRoom() {
        return room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getGetCheckOutDate() {
        return getCheckOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", checkInDate=" + checkInDate +
                ", getCheckOutDate=" + getCheckOutDate +
                '}';
    }
}
