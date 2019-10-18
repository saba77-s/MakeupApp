package model;

import exceptions.InvalidTone;

import java.util.ArrayList;

public class Member   {

    public static String name = "";
    public static String email = "";
    public static ArrayList<String> toBuy = new ArrayList();
    public static Integer tone;

    public Member(Integer skinTone) throws InvalidTone {
        if (skinTone < 0) {
            throw new InvalidTone();
        } else {
            Member.tone = skinTone;
        }
    }
}
