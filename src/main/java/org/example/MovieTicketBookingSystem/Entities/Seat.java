package org.example.MovieTicketBookingSystem.Entities;

import org.example.MovieTicketBookingSystem.Enums.SeatType;

public class Seat {
    private int seatNumber;
    private SeatType seatType;
    private double price;

    public Seat(int seatNumber, SeatType seatType, double price) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    public SeatType getSeatType() {
        return seatType;
    }
    public double getPrice() {
        return price;
    }
}
