package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Skin implements Cosmetics,SavableAndLoadable {
    public static String foundation;
    public static String concealer;
    public static String contour;
    public static String primer;

    public static String getFoundation() {
        return foundation;
    }

    public static void setFoundation(String f) {
        foundation = f;
    }

    public static String getConcealer() {
        return concealer;
    }

    public static void setConcealer(String c) {
        concealer = c;
    }

    public static String getContour() {
        return contour;
    }

    public static void setContour(String co) {
        contour = co;
    }

    public static String getPrimer() {
        return primer;
    }

    public static void setPrimer(String p) {
        primer = p;
    }

    public static ArrayList<String> concealerl = new ArrayList<>();

    {
        {
            concealerl.add("Fenty");
            concealerl.add("Smashbox");
            concealerl.add("Clinique");
            concealerl.add("Urban Decay");
        }
    }

    public static ArrayList<String> foundationl = new ArrayList<String>();

    {
        {
            foundationl.add("Fenty");
            foundationl.add("Smashbox");
            foundationl.add("Clinique");
            foundationl.add("Urban Decay");
        }
    }

    public static ArrayList<String> contourl = new ArrayList<String>();

    {
        {
            contourl.add("Fenty");
            contourl.add("Smashbox");
            contourl.add("Clinique");
            contourl.add("Urban Decay");
        }
    }

    public static ArrayList<String> primerl = new ArrayList<String>();

    {
        {
            contourl.add("Fenty");
            contourl.add("Smashbox");
            contourl.add("Clinique");
            contourl.add("Urban Decay");

        }
    }

    //REQUIRES:
    //MODIFIES:
    //EFFECTS: CREATES AN OBJECT WITH FOUR DIFFERENT PARAMETERS
    public Skin() {
        setFoundation(getFoundation());
        setConcealer(getConcealer());
        setContour(getContour());
        setPrimer(getPrimer());
    }

    //Requires: i TO BE A NAME OF A FOUNDATION BRAND
    //Modifies: FOUNDATION LIST
    //Effects: ADDS THE NEW SKIN BRAND TO THE LIST IF IT DOESN'T ALREADY EXIST IN THERE
    @Override
    public void insert(String i, ArrayList foundationl) {
        if (!contains(i, foundationl)) {
            foundationl.add(i);
        }
    }

    //REQUIRES:
    //MODISIES:
    //EFFECTS: RETURNS TRUE IF THE SKIN PRODUCT ALREADY EXIST IN THE LIST
    @Override
    public  boolean contains(String foundation, ArrayList foundationl) {
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
