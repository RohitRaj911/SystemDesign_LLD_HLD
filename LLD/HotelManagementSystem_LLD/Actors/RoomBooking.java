package Actors;

import java.util.List;

import Hotel.Date;

public class RoomBooking {
    String bookingId;
    Date startDate;
    int numOfdays;
    BookingStatus bookingStatus;
    List<Customer>customerlist;
    List<Room>roomsList;
}
