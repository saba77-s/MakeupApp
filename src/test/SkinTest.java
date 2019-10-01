import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Main;
import ui.Member;
import ui.Skin;
import ui.Skin.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ui.Skin.*;

public class SkinTest {
    static ArrayList<String> testarr;
    public int NUMITEMS;
    @BeforeEach
    public void runBefore() { testarr = new ArrayList<>(); }

    @Test
    public void testSkin(){
        String f= "a";
        String c = "b";
        String co = "c";
        String p = "d";
        Skin b = new Skin(f,c,co,p);
        assertEquals(b.foundation,f);
        assertEquals(b.concealer,c);
        assertEquals(b.contour,co);
        assertEquals(b.primer,p);
    }

    @Test
    public void testSize() {
        assertEquals(0, testarr.size());
        for (int i = 0; i < NUMITEMS; i++) {
            insert(String.valueOf(i),testarr);
        }

        assertEquals(NUMITEMS, testarr.size());
    }

    @Test
    public void testContainsOne() {
        assertFalse(contains(String.valueOf(1),testarr));
        insert(String.valueOf(1),testarr);
        assertTrue(contains(String.valueOf(1),testarr));
    }

    @Test
    public void testContainsLots(){
        for (int i = 0; i<NUMITEMS;i++) {
            insert(String.valueOf(i),testarr);
        }
        for (int i = 0; i < NUMITEMS; i++) {
            assertTrue(testarr.contains(i));
        }
    }

    @Test
    void testInsert() {
        insert(String.valueOf(1),testarr);
        assertTrue(contains(String.valueOf(1),testarr));
        assertEquals(1, testarr.size());
    }

    @Test
    public void testDuplicate(){
        insert(String.valueOf(6),testarr);
        insert(String.valueOf(6),testarr);
        assertTrue(contains(String.valueOf(6),testarr));
        assertEquals(1,testarr.size());
    }


}