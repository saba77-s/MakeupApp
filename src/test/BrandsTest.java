import model.Ambassador;
import model.Brands;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrandsTest {
    @Test
    public void getBrandTest(){
        Ambassador a = new Ambassador("2m","t");
        Brands b = new Brands("s",a,2000);
        b.setAmbassador(a);
        assertTrue(b.getName().equals("s"));
        b.setName("t");
        assertEquals("t",b.getName());
        b.setPay(6);
        assertEquals(b.getPay(),6);

    }

}
