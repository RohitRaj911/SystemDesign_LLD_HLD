import java.util.ArrayList;

public class RegisteredUser extends User{
    private ArrayList<Ticket> bookingHistory;

    public RegisteredUser(int userid, String name) {
        super(userid, name);
        this.bookingHistory = new ArrayList<>();
    }    
}
