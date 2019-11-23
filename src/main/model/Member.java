package model;

import exceptions.InvalidTone;

import java.util.ArrayList;

public class Member   {

    private int bookedTime;
    private static String name = "";
    private static String email = "";
    public static ArrayList<String> toBuy = new ArrayList();
    public static Integer tone;
    private String address;

    public Member(String name) {
        this.name = name;
    }

    public void setBookedTime(int time) {
        this.bookedTime = time;
    }

    public int getBookedTime() {
        return bookedTime;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public static String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
