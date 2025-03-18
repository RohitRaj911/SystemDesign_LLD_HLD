package Address;

public class Address {
    String location;
    String city;
    String state;
    int pincode;


    public Address(String location, String city, String state, int pincode) {
        this.location = location;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getLocation() {
        return location;
    }
    
    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }
    public int getPincode() {
        return pincode;
    }
    
}
