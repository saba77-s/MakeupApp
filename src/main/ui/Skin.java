package ui;

import java.util.ArrayList;
import java.util.List;

public class Skin {
    public String foundation;
    public String concealer;
    public String contour;
    public String primer;
    static ArrayList<String> concealerl = new ArrayList<>();

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

    static ArrayList<String> contourl = new ArrayList<String>();

    {
        {
            contourl.add("Fenty");
            contourl.add("Smashbox");
            contourl.add("Clinique");
            contourl.add("Urban Decay");
        }
    }

    static ArrayList<String> primerl = new ArrayList<String>();

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
    public Skin(String f, String c, String co, String p) {
        foundation = f;
        concealer = c;
        contour = co;
        primer = p;
    }
    //Requires: i TO BE A NAME OF A FOUNDATION BRAND
    //Modifies: FOUNDATION LIST
    //Effects: ADDS THE NEW SKIN BRAND TO THE LIST IF IT DOESN'T ALREADY EXIST IN THERE
    public static void insert(String i, ArrayList foundationl) {
        if (!contains(i, foundationl)) {
            foundationl.add(i);
        }
    }
    //REQUIRES:
    //MODISIES:
    //EFFECTS: RETURNS TRUE IF THE SKIN PRODUCT ALREADY EXIST IN THE LIST
    public static boolean contains(String foundation, ArrayList foundationl) {
        return foundationl.contains(foundation);
    }
}



