package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ToBuy {

    static ArrayList<String> com = new ArrayList<>();
    static ArrayList<String> list = new ArrayList<>();


    public abstract void comment();

    public static void list() {
        Scanner q = new Scanner(System.in);
        String h = q.nextLine();
        list.add(h);
    }


}
