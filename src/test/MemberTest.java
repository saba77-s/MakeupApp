import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Main;
import ui.Member;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;


public class MemberTest {

    Member u =new Member();


    @Test
    public void personTest(){
        assertEquals( u.name,"");
        assertEquals( u.email,"");
    }
}
