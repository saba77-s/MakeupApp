package model;

public class Store {

    private String city;
    private int hours;

    public Store(String city, int hours) {
        this.city = city;
        this.hours = hours;
    }

    public  String getCity() {
        return city;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
