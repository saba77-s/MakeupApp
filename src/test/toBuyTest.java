import exceptions.Null;
import org.junit.jupiter.api.Test;
import ui.Main;

import static org.junit.jupiter.api.Assertions.fail;

public class toBuyTest {
    @Test
    public void notNullEntry(){
        String r = "f";
        try {
            Main.toBuy(r);
        } catch (Null aNull) {
            fail("got exception nut null when we shouldn't have");
        }
    }
}
