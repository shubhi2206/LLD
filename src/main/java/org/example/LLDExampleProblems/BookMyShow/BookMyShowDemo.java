package org.example.LLDExampleProblems.BookMyShow;

import org.example.LLDExampleProblems.BookMyShow.ENUMS.City;
import org.example.LLDExampleProblems.BookMyShow.ENUMS.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShowDemo {
    MovieController movieController;
    TheatreController theatreController;
    BookMyShowDemo(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShowDemo bookMyShowDemo = new BookMyShowDemo();
        bookMyShowDemo.initialize();

        bookMyShowDemo.createBooking(City.BANGALORE, "Baahubali");
        //user2
        bookMyShowDemo.createBooking(City.BANGALORE, "Baahubali");


    }

    private void createBooking(City userCity, String movieName){
        List<Movie> moviesByCity = movieController.getMoviesByCity(userCity);
        Movie interestedMovie = null;
        for(Movie m : moviesByCity){
            if(m.getMovieName().equalsIgnoreCase(movieName))
                interestedMovie = m;
        }

        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShows(interestedMovie,userCity);
        Map.Entry<Theatre,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        int seatNumber = 30;
        List<Integer> bookedSeat = interestedShow.getBookedSeats();
        if(!bookedSeat.contains(seatNumber)){
            bookedSeat.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);
        }else{
            System.out.println("seat already booked, try again");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    private void initialize(){
        createMovies();
        createTheatre();
    }

    //Create theatres with shows, screens and seats
    private void createTheatre() {
        Movie avengers = movieController.getMovieByName("Avengers");
        Movie baahuBali = movieController.getMovieByName("Baahubali");

        Theatre inox = new Theatre();
        inox.setTheatreId(1);
        inox.setCity(City.BANGALORE);
        inox.setScreens(createScreen());
        List<Show> showList = new ArrayList<>();
        Show show1 = createShows(1,inox.getScreens().get(0),avengers,10);
        Show show2 = createShows(2,inox.getScreens().get(0),baahuBali,18);
        showList.add(show1);
        showList.add(show2);
        inox.setShows(showList);

        Theatre pvr = new Theatre();
        pvr.setTheatreId(2);
        pvr.setCity(City.DELHI);
        pvr.setScreens(createScreen());
        List<Show> showList2 = new ArrayList<>();
        Show show3 = createShows(3,pvr.getScreens().get(0),avengers,12);
        Show show4 = createShows(4,pvr.getScreens().get(0),baahuBali,20);
        showList2.add(show3);
        showList2.add(show4);
        pvr.setShows(showList2);

        theatreController.addTheatre(pvr, City.DELHI);
        theatreController.addTheatre(inox, City.BANGALORE);

    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }


    private List<Screen> createScreen(){
        List<Screen> screens = new ArrayList<>();
        Screen screen = new Screen();
        screen.setScreenId(1);
        screen.setSeats(createSeats());
        screens.add(screen);
        return screens;
    }

    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;

    }

    private void createMovies() {
        Movie avengers = new Movie(1,"Avengers",128);
        Movie baahubali = new Movie(2,"Baahubali",140);

        movieController.addMovie(City.BANGALORE,avengers);
        movieController.addMovie(City.BANGALORE,baahubali);
        movieController.addMovie(City.DELHI,avengers);
        movieController.addMovie(City.DELHI,baahubali);
    }
}
