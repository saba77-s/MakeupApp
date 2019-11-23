import exceptions.InvalidTone;
import model.BeautyShop;
import model.Member;
import model.Store;
import model.StoreSuggester;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BeautyShopTest {

    Member member ;
    Store store;
    BeautyShop beautyShop;

    @BeforeEach
    public void runBefore() throws InvalidTone {
        member = new Member("8");
        store = new Store("georgia",9);
        beautyShop = new BeautyShop(7);
    }

    @Test
    public void makeNewBookingsTest(){
        assertTrue(beautyShop.makeNewBookings(member,6));
        assertFalse(beautyShop.makeNewBookings(member,9));
    }

    @Test
    public void cancelBookingTest(){
        beautyShop.makeNewBookings(member,6);
        assertTrue(beautyShop.cancelBooking(member,6));
        assertFalse(beautyShop.cancelBooking(member,10));
    }

    @Test
    public void changeBookingTest(){
        beautyShop.makeNewBookings(member,5);
        beautyShop.cancelBooking(member,5);
        beautyShop.makeNewBookings(member,5);
        beautyShop.changeBooking(member,4);
    }

    @Test
    public void confirmBookingTest(){
        beautyShop.makeNewBookings(member,5);
        assertTrue(beautyShop.confirmBooking(member,5));
    }

    @Test
    public void addStoreTest(){
        beautyShop.addStore(store);
    }

    @Test
    public void changeStoreHoursTest(){
        beautyShop.changeStoreHours(6,store);
    }

}
