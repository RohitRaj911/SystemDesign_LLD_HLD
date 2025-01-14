import java.util.ArrayList;

public class Theaters {
    private int id;
    private String name;
    private String location;
    private int capacity;
    
    private ArrayList<Shows> shows;

    //Constructor
    //new theater will have emty list of shows
    public Theaters(int id, String name, String location, int capacity) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Shows> getShows() {
        return shows;
    }

    public void setShows(ArrayList<Shows> shows) {
        this.shows = shows;
    }
    
}
