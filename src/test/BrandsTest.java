import model.Ambassador;
import model.Brands;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BrandsTest {

    @Test
    public void getBrandTest(){
        Ambassador a = new Ambassador("2m","t");
        Brands b = new Brands("s",2000);
        b.setAmbassador(a);
        assertEquals(a,b.getAmbassador());
        assertTrue(b.getName().equals("s"));
        b.setName("t");
        assertEquals("t",b.getName());
        b.setPay(6);
        assertEquals(b.getPay(),6);

    }

    @Test
    public void getBrand2Test(){
        Ambassador a = new Ambassador("2m","t");
        Brands s = new Brands("p",200);
        Brands p = new Brands("p",70);
        assertTrue(s.equals(p));
        Brands t = new Brands("",0);
        assertFalse(s.equals(t));
    }
}
