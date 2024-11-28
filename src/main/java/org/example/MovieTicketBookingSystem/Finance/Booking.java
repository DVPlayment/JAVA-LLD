package org.example.MovieTicketBookingSystem.Finance;
import org.example.MovieTicketBookingSystem.Entities.Seat;
import org.example.MovieTicketBookingSystem.Entities.Show;

import java.util.List;
public class Booking {
    private List<Seat> seats;
    private Show show;
    private Payment payment;

    public Booking(Show show, Payment payment, List<Seat> seats) {
        this.show = show;
        this.payment = payment;
        this.seats = seats;
    }

    public double getCost(){
        double cost = 0;
        for (Seat seat : seats) {
            cost += seat.getPrice();
        }
        return cost;
    }

    public void printBookingDetails(){
        System.out.println("Movie name " + this.show.getMovie().getTitle());
        System.out.println("Movie duration " + this.show.getMovie().getDurationInMins());
        System.out.println("Movie start time " + this.show.getStartTime());
        System.out.println("Movie end time " + this.show.getEndTime());
        System.out.println("Cost: " + this.getCost());


    }

    public void pay(){
        this.payment.pay();
    }

}
