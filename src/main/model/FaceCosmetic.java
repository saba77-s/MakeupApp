package model;

import java.util.ArrayList;

public class FaceCosmetic extends Face {
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
    public FaceCosmetic() {
        setFoundation(getFoundation());
        setConcealer(getConcealer());
        setContour(getContour());
        setPrimer(getPrimer());
    }


}
