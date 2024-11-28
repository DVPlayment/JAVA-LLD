package org.example.MovieTicketBookingSystem.Controller;

import org.example.MovieTicketBookingSystem.Entities.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    private List<Theatre> theatres;
    private Map<String, List<Theatre>> cityVsTheatres;

    public TheatreController() {
        this.theatres = new ArrayList<Theatre>();
        this.cityVsTheatres = new HashMap<String, List<Theatre>>();
    }

    public void addTheatreToCity(String city, Theatre theatre) {
        List<Theatre> theatres = cityVsTheatres.get(city);
        if (theatres == null) {
            theatres = new ArrayList<Theatre>();
            cityVsTheatres.put(city, theatres);
        }
        theatres.add(theatre);
    }

    public List<Theatre> getTheatres(String city) {
        return cityVsTheatres.get(city);
    }

}
