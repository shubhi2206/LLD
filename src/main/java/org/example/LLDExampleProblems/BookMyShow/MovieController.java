package org.example.LLDExampleProblems.BookMyShow;

import org.example.LLDExampleProblems.BookMyShow.ENUMS.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City,List<Movie>> cityVsMovies;
    List<Movie> allMovies;
    MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    //Add Movie to a particular city
    public void addMovie(City city, Movie movie){
        allMovies.add(movie);
        List<Movie> movies = cityVsMovies.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city,movies);
    }

    //Get Movie
    public Movie getMovieByName(String name){
        for(Movie m : allMovies){
            String n = m.getMovieName();
            if(m.getMovieName().equalsIgnoreCase(name))
                return m;
        }
        return null;
    }
    List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }

}
