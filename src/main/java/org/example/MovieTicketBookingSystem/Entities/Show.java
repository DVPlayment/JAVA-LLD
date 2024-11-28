package org.example.MovieTicketBookingSystem.Entities;

import java.util.*;

public class Show {
    private UUID id;
    private Date startTime;
    private Movie movie;
    private List<Seat> seats;
    private List<Integer> bookedSeats;

    public Show(Date startTime, Movie movie) {
        this.id = UUID.randomUUID();
        this.startTime = startTime;
        this.movie = movie;
        this.seats = new ArrayList<Seat>();
        this.bookedSeats = new ArrayList<Integer>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void bookSeat(int seatId) {
        bookedSeats.add(seatId);
    }

    public Movie getMovie() {
        return movie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getStartTime());
        calendar.add(Calendar.MINUTE, movie.getDurationInMins());
        return calendar.getTime();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public boolean isSeatBooked(Seat seat) {
        return bookedSeats.contains(seat.getSeatNumber());
    }

}