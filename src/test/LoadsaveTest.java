import org.junit.jupiter.api.Test;
import model.SkinCosmetic;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
