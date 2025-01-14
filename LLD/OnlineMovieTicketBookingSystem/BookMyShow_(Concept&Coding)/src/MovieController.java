import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Enums.City;

public class MovieController {
    Map<City,List<Movie>> cityVsMovie;
    List<Movie> allMovies;

    public MovieController() {
        cityVsMovie = new HashMap<>();
        allMovies = new ArrayList<>();
    }
    
    //ADD Movies to a particular city
    void addMovie(Movie movie, City city){
        allMovies.add(movie);
        
        List<Movie> moviesList = cityVsMovie.getOrDefault(city, new ArrayList<>());
        moviesList.add(movie);
        cityVsMovie.put(city, moviesList);
    }

    Movie getMovieByName(String movieName){
        for(Movie movie : allMovies){
            if(movie.getMovieName().equals(movieName));
            return movie;
        }
        return null;
    }

    List<Movie> getMovieByCity(City city){
        return cityVsMovie.get(city);
    }
}
