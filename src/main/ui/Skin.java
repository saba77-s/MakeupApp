package ui;

import java.util.ArrayList;
import java.util.List;

public class Skin {
    public String foundation;
    public String concealer;
    public String contour;
    public String primer;
    static ArrayList<String> concealerl = new ArrayList<String>();

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

    public Skin(String f, String c, String co, String p) {
        foundation = f;
        concealer = c;
        contour = co;
        primer = p;
        return;
    }


    public static void insert(String i, ArrayList foundationl) {
        if (!contains(i, foundationl)) {
            foundationl.add(i);
        }
    }


    public static boolean contains(String foundation, ArrayList foundationl) {
        return foundationl.contains(foundation);
    }
}



