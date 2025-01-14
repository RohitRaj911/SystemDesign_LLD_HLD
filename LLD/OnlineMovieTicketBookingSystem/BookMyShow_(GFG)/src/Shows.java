import java.util.Date;

public class Shows {
    private int id;
    private Date showTime;
    private int availableSeats;

    Movies movie;
    private Theaters theater;
    public Shows(int id, Date showTime, Movies movie, Theaters theater) {
        this.id = id;
        this.showTime = showTime;
        this.movie = movie;
        this.theater = theater;
        this.availableSeats = theater.getCapacity();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getShowTime() {
        return showTime;
    }
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public Movies getMovie() {
        return movie;
    }
    public void setMovie(Movies movie) {
        this.movie = movie;
    }
    public Theaters getTheater() {
        return theater;
    }
    public void setTheater(Theaters theater) {
        this.theater = theater;
    }

    
    
}
