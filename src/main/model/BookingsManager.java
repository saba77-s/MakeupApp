package model;

import java.util.ArrayList;

public class BookingsManager {

    private ArrayList<Member> bookings;

    public BookingsManager(int hours) {
        bookings = new ArrayList<>();
        for (int i = 0;i <= hours;i++) {
            bookings.add(i,null);
        }
    }

    public boolean makeNewBookings(Member m, int bookingTime) {
        if (invalidBookingTime(bookingTime >= bookings.size(), "We can't process that booking time")) {
            return false;
        }
        System.out.println("Customer " + m.getName() + " has been booked at " + bookingTime);
        bookings.set(bookingTime,m);
        m.setBookedTime(bookingTime);
        return true;
    }

    private boolean invalidBookingTime(boolean b, String s) {
        if (b) {
            System.out.println(s);
            return true;
        }
        return false;
    }

    public boolean cancelBooking(Member m,int bookingTime) {
        if (invalidBookingTime(bookingTime >= bookings.size(), "We can't process that booking time")) {
            return false;
        }
        System.out.println("Time :" + bookingTime + "has been cancelled");
        bookings.set(bookingTime,null);
        m.setBookedTime(0);
        return true;
    }

    public void changeBooking(Member m,int newTime) {
        int bookedTime = m.getBookedTime();
        System.out.print(m.getName() + "'s time is changing from " + bookedTime);
        System.out.println(" to " + newTime);
        cancelBooking(m, bookedTime);
        makeNewBookings(m,newTime);
    }

    public boolean confirmBooking(Member m, int bookingTime) {
        if (invalidBookingTime(bookingTime == m.getBookedTime(), "You have been successfully booked at this time!")) {
            return true;
        }
        System.out.println("Booking not found:(");
        return false;
    }
}
