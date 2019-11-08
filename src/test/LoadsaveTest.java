import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        FaceCosmetic s = new FaceCosmetic();
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
        FaceCosmetic s = new FaceCosmetic();
        PrintWriter writer = new PrintWriter("inputfile.txt", "UTF-8");
        writer.println("l");
        writer.println("g");
        writer.println("i");
        writer.println("o");
        writer.close();
        s.load();
        assertEquals(FaceCosmetic.getFoundation(),"l");
        assertEquals(FaceCosmetic.getConcealer(),"g");
        assertEquals(FaceCosmetic.getContour(),"i");
        assertEquals(FaceCosmetic.getPrimer(),"o");
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
        FaceCosmetic b = new FaceCosmetic();
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
        FaceCosmetic s = new FaceCosmetic();
        assertEquals(0, testarr.size());
        for (int i = 0; i < NUMITEMS; i++) {
            s.insert(String.valueOf(i),testarr);
        }

        assertEquals(NUMITEMS, testarr.size());
    }

    @Test
    public void testContainsOne() {
        FaceCosmetic s = new FaceCosmetic();
        assertFalse(s.contains(String.valueOf(1),testarr));
        s.insert(String.valueOf(1),testarr);
        assertTrue(s.contains(String.valueOf(1),testarr));
    }

    @Test
    public void testContainsLots(){
        FaceCosmetic s = new FaceCosmetic();
        for (int i = 0; i<NUMITEMS;i++) {
            s.insert(String.valueOf(i),testarr);
        }
        for (int i = 0; i < NUMITEMS; i++) {
            assertTrue(testarr.contains(i));
        }
    }

    @Test
    void testInsert() {
        FaceCosmetic s = new FaceCosmetic();
        s.insert(String.valueOf(1),testarr);
        assertTrue(s.contains(String.valueOf(1),testarr));
        assertEquals(1, testarr.size());
    }

    @Test
    public void testDuplicate(){
        FaceCosmetic s = new FaceCosmetic();
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
        FaceCare s = new FaceCare();
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
