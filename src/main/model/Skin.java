package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static model.SkinCosmetic.*;

public abstract class Skin implements SavableAndLoadable {

    //Requires: i TO BE A NAME OF A FOUNDATION BRAND
    //Modifies: FOUNDATION LIST
    //Effects: ADDS THE NEW SKIN BRAND TO THE LIST IF IT DOESN'T ALREADY EXIST IN THERE
    public static void insert(String i, ArrayList b) {
        if (!contains(i, b)) {
            b.add(i);
        }
    }
    //REQUIRES:
    //MODISIES:
    //EFFECTS: RETURNS TRUE IF THE SKIN PRODUCT ALREADY EXIST IN THE LIST
    public static boolean contains(String foundation, ArrayList foundationl) {
        return foundationl.contains(foundation);
    }

    @Override
    public void save() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("inputfile.txt", "UTF-8");
        writer.println(getFoundation());
        writer.println(getConcealer());
        writer.println(getContour());
        writer.println(getPrimer());
        writer.close();
    }

    @Override
    public void load() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        setFoundation(lines.get(0));
        setConcealer(lines.get(1));
        setContour(lines.get(2));
        setPrimer(lines.get(3));
    }
}



