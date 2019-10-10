import model.SkinCare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSkinCare {
    @Test
    public void testSkinCare(){
        SkinCare s = new SkinCare();
        s.setScrub("Y");
        s.setEyeCream("G");
        s.setFaceWash("j");
        s.setMoisturizer("d");
        s.setLotion("a");
        assertEquals("Y",s.getScrub());
        assertEquals("G",s.getEyeCream());
        assertEquals("j",s.getFaceWash());
        assertEquals("d",s.getMoisturizer());
        assertEquals("a",s.getLotion());

    }
}
