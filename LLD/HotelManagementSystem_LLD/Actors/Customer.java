package Actors;

import java.util.List;

public class Customer extends Person{
    Search searchObj;
    RoomBooking bookingObj;

    //returns List of rooms that customers booked
    List<RoomBooking>getAllBookings(){
        List<RoomBooking>bookingList = null;
        return bookingList;
    }

    public RoomBooking createBooking(){
        RoomBooking tempRoom = null;
        return tempRoom;
    }
    public RoomBooking cancelBooking(int bookingId){
        RoomBooking tempRoom = null;
        return tempRoom;
    }
}
