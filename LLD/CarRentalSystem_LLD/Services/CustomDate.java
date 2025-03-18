package Services;

public class CustomDate {
    int day;
    int month;
    int year;

    public CustomDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String getDate(){
        return String.format("%02d-%02d-%04d", day, month, year);
    }
}
