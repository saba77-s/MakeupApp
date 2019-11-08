package model;

import exceptions.InvalidTone;

import java.util.ArrayList;

public class Member   {

    private int bookedTime;
    public static String name = "";
    public static String email = "";
    public static ArrayList<String> toBuy = new ArrayList();
    public static Integer tone;
    private String address;

    public Member(Integer skinTone) throws InvalidTone {
        if (skinTone < 0) {
            throw new InvalidTone();
        } else {
            Member.tone = skinTone;
        }
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
}
