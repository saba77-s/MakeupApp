package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BeautyShop {

    private BookingsManager bookingsManager;
    private StoreSuggester storeSuggester;

    public BeautyShop() {

        bookingsManager = new BookingsManager();
        storeSuggester = new StoreSuggester();
    }

    public boolean makeNewBookings(Member m, int bookingTime) {
        return bookingsManager.makeNewBookings(m, bookingTime);
    }

    public boolean cancelBooking(Member m,int bookingTime) {
        return bookingsManager.cancelBooking(m,bookingTime);
    }

    public void suggestStore(Member member) {
        storeSuggester.suggestStore(member);

    }

    public void addStore(Store store) {
        storeSuggester.addStore(store);
    }

    public void changeStoreHours(int hours,Store store) {
        storeSuggester.changeStoreHours(hours,store);
    }


    public void changeBooking(Member m,int newTime) {
        bookingsManager.changeBooking(m,newTime);
    }

    public boolean confirmBooking(Member m, int bookingTime) {
        return bookingsManager.confirmBooking(m,bookingTime);
    }
}
