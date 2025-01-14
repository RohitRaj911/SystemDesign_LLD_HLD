//Design + Concurrency Management
//Concurrency Managment :- care should be taken that one ticket do not assigned to different people

import java.util.*;

import Enums.City;
import Enums.SeatCategory;

public class BookMyShow {
    private MovieController movieController;
    private TheaterController theaterController;

    public BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();

        // User 1
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");

        // User 2
        bookMyShow.createBooking(City.Bangalore, "AVENGERS");
    }

    private void createBooking(City userCity, String movieName) {
        // 1. Search movie by location
        List<Movie> movies = movieController.getMovieByCity(userCity);

        // 2. Select the movie to watch
        Movie interestedMovie = null;
        for (Movie movie : movies) {
            if (movie.getMovieName().equals(movieName)) {
                interestedMovie = movie;
            }
        }

        if (interestedMovie == null) {
            System.out.println("Movie not found.");
            return;
        }

        // 3. Get all shows of this movie in the location
        Map<Theater, List<Show>> showsTheatreWise = theaterController.getAllShow(interestedMovie, userCity);

        if (showsTheatreWise.isEmpty()) {
            System.out.println("No shows available for the selected movie in the selected city.");
            return;
        }

        // 4. Select a particular show
        Map.Entry<Theater, List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        // 5. Select a seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();

        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);

            // Start payment process
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if (screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(myBookedSeats);
            booking.setShow(interestedShow);

            System.out.println("BOOKING SUCCESSFUL");
        } else {
            System.out.println("Seat already booked, try again.");
        }
    }

    private void initialize() {
        System.out.println("Initializing BookMyShow...");
        // Create movies
        createMovies();

        // Create theaters with screens, seats, and shows
        createTheatre();
    }

    private void createTheatre() {
        System.out.println("Initializing theatres...");

        Movie avengerMovie = movieController.getMovieByName("AVENGERS");
        Movie baahubali = movieController.getMovieByName("BAAHUBALI");

        // Theatre 1: INOX
        Theater inoxTheatre = new Theater();
        inoxTheatre.setTheaterId(1);
        inoxTheatre.setScreen(createScreens());
        inoxTheatre.setCity(City.Bangalore);

        List<Show> inoxShows = new ArrayList<>();
        inoxShows.add(createShow(1, inoxTheatre.getScreen().get(0), avengerMovie, 8));
        inoxShows.add(createShow(2, inoxTheatre.getScreen().get(0), baahubali, 16));
        inoxTheatre.setShow(inoxShows);

        // Theatre 2: PVR
        Theater pvrTheatre = new Theater();
        pvrTheatre.setTheaterId(2);
        pvrTheatre.setScreen(createScreens());
        pvrTheatre.setCity(City.Delhi);

        List<Show> pvrShows = new ArrayList<>();
        pvrShows.add(createShow(3, pvrTheatre.getScreen().get(0), avengerMovie, 13));
        pvrShows.add(createShow(4, pvrTheatre.getScreen().get(0), baahubali, 20));
        pvrTheatre.setShow(pvrShows);

        // Add theaters to controller
        theaterController.addTheater(inoxTheatre, City.Bangalore);
        theaterController.addTheater(pvrTheatre, City.Delhi);
    }

    private List<Screen> createScreens() {
        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);
        return screens;
    }

    private Show createShow(int showId, Screen screen, Movie movie, int showStartTime) {
        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime); // 24-hour format
        return show;
    }

    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();

        // 1 to 40: SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        // 41 to 70: GOLD
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        // 71 to 100: PLATINUM
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

    private void createMovies() {
        System.out.println("Initializing movies...");
        // Movie 1: Avengers
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(128);

        // Movie 2: Baahubali
        Movie baahubali = new Movie();
        baahubali.setMovieId(2);
        baahubali.setMovieName("BAAHUBALI");
        baahubali.setMovieDurationInMinutes(180);

        // Add movies to controller
        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(avengers, City.Delhi);
        movieController.addMovie(baahubali, City.Bangalore);
        movieController.addMovie(baahubali, City.Delhi);
    }
}

