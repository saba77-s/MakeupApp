import exceptions.InvalidTone;
import org.junit.jupiter.api.Test;
import model.Member;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MemberTest {

    Member u =new Member(10);

    public MemberTest() throws InvalidTone {
    }


    @Test
    public void personTest(){
        assertEquals( u.name,"");
        assertEquals( u.email,"");
    }
}
