import model.Lips;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class lipsTest {
    Lips a = new Lips();
    @Test
    public void testArr(){
        assertEquals(a.bought.size(),0);
        assertEquals(a.fave.size(),0);
    }
}
