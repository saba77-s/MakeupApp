import model.SkinCosmetic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkinDrugStoreTest {
    static ArrayList<String> testarr;
    public int NUMITEMS;
    @BeforeEach
    public void runBefore() { testarr = new ArrayList<>();}

    @Test
    public void testSkin(){
        String f= "a";
        String c = "b";
        String co = "c";
        String p = "d";
        SkinCosmetic b = new SkinCosmetic();
        assertEquals(b.getFoundation(),f);
        assertEquals(b.getConcealer(),c);
        assertEquals(b.contour,co);
        assertEquals(b.primer,p);
    }

    @Test
    public void testSize() {
        SkinCosmetic s = new SkinCosmetic();
        assertEquals(0, testarr.size());
        for (int i = 0; i < NUMITEMS; i++) {
            s.insert(String.valueOf(i),testarr);
        }

        assertEquals(NUMITEMS, testarr.size());
    }

    @Test
    public void testContainsOne() {
        SkinCosmetic s = new SkinCosmetic();
        assertFalse(s.contains(String.valueOf(1),testarr));
        s.insert(String.valueOf(1),testarr);
        assertTrue(s.contains(String.valueOf(1),testarr));
    }

    @Test
    public void testContainsLots(){
        SkinCosmetic s = new SkinCosmetic();
        for (int i = 0; i<NUMITEMS;i++) {
            s.insert(String.valueOf(i),testarr);
        }
        for (int i = 0; i < NUMITEMS; i++) {
            assertTrue(testarr.contains(i));
        }
    }

    @Test
    void testInsert() {
        SkinCosmetic s = new SkinCosmetic();
        s.insert(String.valueOf(1),testarr);
        assertTrue(s.contains(String.valueOf(1),testarr));
        assertEquals(1, testarr.size());
    }

    @Test
    public void testDuplicate(){
        SkinCosmetic s = new SkinCosmetic();
        s.insert(String.valueOf(6),testarr);
        s.insert(String.valueOf(6),testarr);
        assertTrue(s.contains(String.valueOf(6),testarr));
        assertEquals(1,testarr.size());
    }


}