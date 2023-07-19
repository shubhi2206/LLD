package org.example.LLDExampleProblems.BookMyShow;

public class Movie {
    int movieId;
    String movieName;
    int minutes;

    public Movie() {
    }

    public Movie(int movieId, String movieName, int minutes) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.minutes = minutes;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
