package ui;

import java.util.*;

class Skin {
    String foundation;
    String concealer;
    String contour;
    String primer;
    ArrayList<String> concealerl = new ArrayList<String>();
    static ArrayList<String> foundationl = new ArrayList<String>();//Creating arraylist
    ArrayList<String> contourl = new ArrayList<String>();
    ArrayList<String> primerl = new ArrayList<String>();

    public Skin(String f, String c, String co, String p) {
        foundation = f;
        concealer = c;
        contour = co;
        primer = p;
    }

    public static List<String> concealers(ArrayList<String> concealerl) {
        concealerl.add("Nars");//Adding object in arraylist
        concealerl.add("IT");
        concealerl.add("Tarte");
        concealerl.add("Fenty");
        return concealerl;
    }

    public static List<String> foundations(ArrayList<String> foundationl) {
        foundationl.add("Fenty");
        foundationl.add("Smashbox");
        foundationl.add("Clinique");
        foundationl.add("Urban Decay");
        return foundationl;
    }

    public void insertf(String i) {
        if (!containsf(i))
            foundationl.add(i);
    }

    public boolean containsf(String foundation) {
        return foundationl.contains(foundation);
    }

    public boolean containsc(String concealer) {
        return concealerl.contains(concealer);
    }

    public boolean containsco(String contour) {
        return contourl.contains(contour);
    }

    public boolean containsp(String primer) {
        return primerl.contains(primer);
    }
}



