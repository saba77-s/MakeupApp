package model;

import java.util.ArrayList;

public class SkinCare extends SkinCosmetic {
    private static String scrub;
    private static String eyeCream;
    private static String faceWash;
    private static String moisturizer;
    private static String lotion;

    public  String getScrub() {
        return scrub;
    }

    public static void setScrub(String c) {
        scrub = c;
    }

    public  String getEyeCream() {
        return eyeCream;
    }

    public static void setEyeCream(String e) {
        eyeCream = e;
    }

    public  String getFaceWash() {
        return faceWash;
    }

    public static void setFaceWash(String f) {
        faceWash = f;
    }

    public  String getMoisturizer() {
        return moisturizer;
    }

    public static void setMoisturizer(String m) {
        moisturizer = m;
    }

    public  String getLotion() {
        return lotion;
    }

    public static void setLotion(String l) {
        lotion = l;
    }

    public static ArrayList<String> scrubl = new ArrayList<>();

    {
        {
            scrubl.add("Fenty");
            scrubl.add("Smashbox");
            scrubl.add("Clinique");
            scrubl.add("Urban Decay");
        }
    }

    public static ArrayList<String> eyeCreaml = new ArrayList<String>();

    {
        {
            eyeCreaml.add("Fenty");
            eyeCreaml.add("Smashbox");
            eyeCreaml.add("Clinique");
            eyeCreaml.add("Urban Decay");
        }
    }

    public static ArrayList<String> faceWashl = new ArrayList<String>();

    {
        {
            faceWashl.add("Fenty");
            faceWashl.add("Smashbox");
            faceWashl.add("Clinique");
            faceWashl.add("Urban Decay");
        }
    }

    public static ArrayList<String> moisturizerl = new ArrayList<String>();

    {
        {
            moisturizerl.add("Fenty");
            moisturizerl.add("Smashbox");
            moisturizerl.add("Clinique");
            moisturizerl.add("Urban Decay");

        }
    }


    public static ArrayList<String> lotionl = new ArrayList<String>();

    {
        {
            lotionl.add("Fenty");
            lotionl.add("Smashbox");
            lotionl.add("Clinique");
            lotionl.add("Urban Decay");

        }
    }


    public SkinCare() {
        setScrub(getScrub());
        setEyeCream(getEyeCream());
        setFaceWash(getFaceWash());
        setMoisturizer(getMoisturizer());
        setLotion(getLotion());
    }


}
