package Hotel;

import Actors.HouseKeeper;

public class HouseKeepingLog {
    String description; // what type of work they perform
    Date startDate; // when they worked
    int duration; //how much time they took
    HouseKeeper houseKeeper;  //who has perform the task

    //An api which assign room to housekeeper in which they work
    public void addRoom(Room room){};
}
