import java.util.Date;

public class Ticket {
    private int id;
    private Date bookingTime;
    private String theater;
    private int numberOfSeats;

    private Show bookedShow;

    public Ticket(int id, Date bookingTime, String theater, int numberOfSeats, Show bookedShow) {
        this.id = id;
        this.bookingTime = bookingTime;
        this.theater = theater;
        this.numberOfSeats = numberOfSeats;
        this.bookedShow = bookedShow;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Show getBookedShow() {
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow) {
        this.bookedShow = bookedShow;
    }

    
}
