import model.FaceCare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFaceCare {
    @Test
    public void testSkinCare(){
        FaceCare s = new FaceCare();
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
