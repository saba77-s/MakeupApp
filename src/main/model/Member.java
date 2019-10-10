package model;

import java.util.Scanner;

public class Member extends ToBuy {

    public String name = "";
    public String email = "";
    public String skinTone = "";


    public void comment() {
        Scanner y = new Scanner(System.in);
        String gi = y.nextLine();
        com.add(gi);
    }
}