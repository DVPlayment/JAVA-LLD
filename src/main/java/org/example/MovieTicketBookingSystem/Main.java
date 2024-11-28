package org.example.MovieTicketBookingSystem;

import org.example.MovieTicketBookingSystem.Controller.MovieController;
import org.example.MovieTicketBookingSystem.Controller.TheatreController;
import org.example.MovieTicketBookingSystem.Entities.*;
import org.example.MovieTicketBookingSystem.Enums.SeatType;
import org.example.MovieTicketBookingSystem.Finance.Payment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running..");
        TheatreController theatreController = new TheatreController();
        MovieController movieController = new MovieController();
        // create 2 movies
        Movie movie1 = new Movie(1, "AVENGERS", 90);
        Movie movie2 = new Movie(2, "DON 2", 110);
        movieController.addMovieToCity("DELHI", movie1);
        movieController.addMovieToCity("DELHI", movie2);

        // create 3 seats
        Seat s1 = new Seat(1, SeatType.GOLD,1000);
        Seat s2 = new Seat(2, SeatType.SILVER,700);
        Seat s3 = new Seat(3, SeatType.PLATINUM,500);


        // create showTime slots
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER); // Months are 0-based, December is 11
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        Date showAt12 = calendar.getTime();

        calendar.set(Calendar.HOUR_OF_DAY, 18);
        Date showAt6 = calendar.getTime();


        // add 2 theatres, each with 1 screen, 2 shows each
        Location loc = new Location("DELHI");

        Screen sc1 = new Screen();
        Show sh12 = new Show(showAt12, movie1);
        sh12.addSeat(s1);
        sh12.addSeat(s2);
        sh12.addSeat(s3);
        Show sh6 = new Show(showAt6, movie2);
        sh6.addSeat(s1);
        sh6.addSeat(s2);
        sh6.addSeat(s3);

        sc1.addShow(sh12);
        sc1.addShow(sh6);
        Theatre th1 = new Theatre(loc);
        th1.addScreen(sc1);



        Screen sc2 = new Screen();
        Show sh122 = new Show(showAt12, movie1);
        sh122.addSeat(s1);
        sh122.addSeat(s2);
        sh122.addSeat(s3);
        Show sh62 = new Show(showAt6, movie2);
        sh62.addSeat(s1);
        sh62.addSeat(s2);
        sh62.addSeat(s3);

        sc2.addShow(sh12);
        sc2.addShow(sh62);
        Theatre th2 = new Theatre(loc);
        th2.addScreen(sc2);

        // add to theatre controller
        theatreController.addTheatreToCity("DELHI", th1);
        theatreController.addTheatreToCity("DELHI", th2);



        // create a booking with seat
        BookMyShow bookMyShow = new BookMyShow(theatreController, movieController);
        User user = new User("DV", loc);
        Movie movie = bookMyShow.getMovies(user.getCity()).getFirst();
        Theatre th = bookMyShow.getTheatres(user.getCity()).getFirst();
        Screen sc = th.getScreens().getFirst();
        List<Show> shs = sc.getShows();

        // choose a show at 6
        Show showToBook = shs.get(1);
        List<Seat> seats = showToBook.getSeats();
        List<Seat> seatsToBook = new ArrayList<>();
        System.out.println("Available seats: " + seats);
        seatsToBook.add(seats.getFirst()); // book gold
        Payment payment = new Payment();


        // booking
        bookMyShow.createBooking(seatsToBook, showToBook, payment);

        // try creating a booking on the same seat
        bookMyShow.createBooking(seatsToBook, shs.getFirst(), payment);


    }
}
