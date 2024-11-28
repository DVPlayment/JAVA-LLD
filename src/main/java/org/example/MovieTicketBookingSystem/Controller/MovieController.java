package org.example.MovieTicketBookingSystem.Controller;

import org.example.MovieTicketBookingSystem.Entities.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    private List<Movie> movies;
    private Map<String, List<Movie>> cityVsMovies;

    public MovieController() {
        this.movies = new ArrayList<Movie>();
        this.cityVsMovies = new HashMap<String, List<Movie>>();
    }

    public void addMovieToCity(String city, Movie movie) {
        List<Movie> movies = cityVsMovies.get(city);
        if (movies == null) {
            movies = new ArrayList<Movie>();
            cityVsMovies.put(city, movies);
        }
        movies.add(movie);
    }

    public List<Movie> getMovies(String city) {
        return cityVsMovies.get(city);
    }

}
