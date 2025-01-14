import java.util.*;

import Enums.City;

public class TheaterController {
    Map<City, List<Theater>>cityVsTheater;
    List<Theater> allTheater;

    public TheaterController() {
        cityVsTheater = new HashMap<>();
        allTheater = new ArrayList<>();
    }
    
    void addTheater(Theater theater, City city){
        allTheater.add(theater);

        List<Theater> theaterList = cityVsTheater.getOrDefault(city, new ArrayList<>());
        theaterList.add(theater);
        cityVsTheater.put(city, theaterList);
    }

    Map<Theater, List<Show>> getAllShow(Movie movie, City city){
        //get all the theater of this city

        Map<Theater, List<Show>> theaterVsShow = new HashMap<>();
        List<Theater> theaterList = cityVsTheater.get(city);

        //filter out the theater which running this movie
        for(Theater theater : theaterList){
            List<Show> givenMovieShow = new ArrayList<>();
            List<Show> shows = theater.getShow();

            for(Show show : shows){
                if(show.movie.getMovieId() == movie.getMovieId()){
                    givenMovieShow.add(show);
                }
            }
            if(!givenMovieShow.isEmpty()){
                theaterVsShow.put(theater, givenMovieShow);
            }
        }
        return theaterVsShow;
    }
    
}
