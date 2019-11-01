import model.Ambassador;
import model.Brands;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmbassadorTest {
    @Test
    public void getAmbassadorTest() {
        Ambassador a = new Ambassador("9m","t");
        Brands b = new Brands("s",a,700);
        a.setName("o");
        assertEquals(a.getName(),"o");
        a.setFollowers("6m");
        assertEquals(a.getFollowers(),"6m");
        a.setBrands(b);
        assertEquals(a.getBrands(),b);
    }

}
