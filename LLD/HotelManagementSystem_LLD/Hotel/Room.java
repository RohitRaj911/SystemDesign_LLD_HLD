package Hotel;
import java.util.List;

public class Room {
    public String roomNumber;
    RoomStatus roomStatus;
    RoomType roomType;
    Double roomPrice;
    //assigned list of keys
    List<RoomKey>keyList;
    //list of work housekeeper has done in that room
    List<HouseKeepingLog>houseKeepingLogs;
}
