package org.example.MovieTicketBookingSystem.Entities;

import org.example.MovieTicketBookingSystem.Controller.MovieController;
import org.example.MovieTicketBookingSystem.Controller.TheatreController;
import org.example.MovieTicketBookingSystem.Finance.Booking;
import org.example.MovieTicketBookingSystem.Finance.Payment;

import java.util.List;

public class BookMyShow {
    private TheatreController theatreController;
    private MovieController movieController;

    public BookMyShow(TheatreController theatreController, MovieController movieController) {
        this.theatreController = theatreController;
        this.movieController = movieController;
    }

    public void createBooking(List<Seat> seats, Show show, Payment payment) {
        // validate & reserve seats in show
        for (Seat seat : seats) {
            if (show.isSeatBooked(seat)) {
                System.out.println("All seats not available");
                return;
            }
        }
        for (Seat seat : seats) {
            show.bookSeat(seat.getSeatNumber());
        }

        Booking booking = new Booking(show, payment, seats);
        booking.printBookingDetails();

    }

    public List<Theatre> getTheatres(String city){
        return theatreController.getTheatres(city);
    }

    public List<Movie> getMovies(String city){
        return movieController.getMovies(city);
    }

}
