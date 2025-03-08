package Hotel;
public class RoomKey {
    String keyId;
    String barcode;
    boolean isAssigned;
    boolean isMaster;
    boolean isActive;
    Date issuedAt;

    //An api which assign this key to specific room
    public void assignRoom(Room room){};
}
