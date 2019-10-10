import model.Lips;
import model.Member;
import model.SkinCare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.SkinCosmetic;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoadsaveTest {
    @Test
    public void Savetest() throws IOException {
        SkinCosmetic s = new SkinCosmetic();
        s.foundation = "s";
        s.concealer = "l";
        s.contour = "k";
        s.primer = "j";
        s.save();
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        assertEquals(lines.get(0),"s");
        assertEquals(lines.get(1),"l");
        assertEquals(lines.get(2),"k");
        assertEquals(lines.get(3),"j");

    }

    @Test
    public void Loadtest() throws IOException {
        SkinCosmetic s = new SkinCosmetic();
        PrintWriter writer = new PrintWriter("inputfile.txt", "UTF-8");
        writer.println("l");
        writer.println("g");
        writer.println("i");
        writer.println("o");
        writer.close();
        s.load();
        assertEquals(SkinCosmetic.getFoundation(),"l");
        assertEquals(SkinCosmetic.getConcealer(),"g");
        assertEquals(SkinCosmetic.getContour(),"i");
        assertEquals(SkinCosmetic.getPrimer(),"o");
    }

    Member u =new Member();


    @Test
    public void personTest(){
        assertEquals( u.name,"");
        assertEquals( u.email,"");
    }

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
        b.setFoundation(f);
        b.setConcealer(c);
        b.setContour(co);
        b.setPrimer(p);
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

    Lips a = new Lips();
    @Test
    public void testArr(){
        assertEquals(a.bought.size(),0);
        assertEquals(a.fave.size(),0);
    }

    @Test
    public void testSkinCare() {
        SkinCare s = new SkinCare();
        s.setScrub("Y");
        s.setEyeCream("G");
        s.setFaceWash("j");
        s.setMoisturizer("d");
        s.setLotion("a");
        assertEquals("Y", s.getScrub());
        assertEquals("G", s.getEyeCream());
        assertEquals("j", s.getFaceWash());
        assertEquals("d", s.getMoisturizer());
        assertEquals("a", s.getLotion());
    }

}
