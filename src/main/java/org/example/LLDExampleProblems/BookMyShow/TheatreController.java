package org.example.LLDExampleProblems.BookMyShow;

import org.example.LLDExampleProblems.BookMyShow.ENUMS.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatres;

    TheatreController(){
        cityVsTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }
    public void addTheatre(Theatre theatre, City city){
        allTheatres.add(theatre);
        List<Theatre> theatres = cityVsTheatre.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city,theatres);
    }

    public Map<Theatre,List<Show>> getAllShows(Movie movie, City city){
        Map<Theatre,List<Show>> theatreVsShow = new HashMap<>();
        List<Theatre> theatres = cityVsTheatre.get(city);
        for(Theatre t: theatres){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = t.getShows();
            for(Show s: shows){
                if(s.getMovie().getMovieName().equalsIgnoreCase(movie.getMovieName()))
                    givenMovieShows.add(s);
            }
            if(!givenMovieShows.isEmpty())
                theatreVsShow.put(t,givenMovieShows);
        }
        return theatreVsShow;

    }
}
