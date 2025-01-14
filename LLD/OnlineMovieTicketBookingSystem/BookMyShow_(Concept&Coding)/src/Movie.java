public class Movie {
    int movieId;
    String movieName;
    int movieDurationInMinutes;
    // other details like Genre, Language can be added

    
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
    public int getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }
    public void setMovieDurationInMinutes(int movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

    
}
