package ui;

import model.Member;
import model.Skin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HEY,Welcome to Sabmetics please enter your name! :)");
        Member u = new Member();
        u.name = scanner.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.println("Do you want to become a member to get the latest updates " + u.name + " Y/N?");
        String ans = scanner.nextLine();
        if (u.email == "") {
            if (ans.equals("Y")) {
                System.out.println("please enter your email address!");
                u.email = b.nextLine();
                System.out.println("Congrats! " + u.name + " You're a Sabmetics member.");
            }
        }
        userRequest();
        Skin s = new Skin();
        s.save();
        s.load();
    }

    public static void userRequest() {
        while (true) {
            System.out.println("Please select what you're looking for or type quit:");
            Scanner scanner = new Scanner(System.in);
            String product = scanner.nextLine();
            if (product.equals("quit")) {
                break;
            }
            if (product.equals("add favourite")) {
                Skin s = new Skin();
                favourite(s);
            }
            if (product.equals("foundation")) {
                System.out.println(Skin.foundationl);
            }
            if (product.equals("concealer")) {
                System.out.println(Skin.concealerl);
            }
        }


    }


    public static void favourite(Skin s) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("please specify the type of your fave product ");
        String foundation = scanner.nextLine();
        Skin.setFoundation(foundation);
        String concealer = scanner.nextLine();
        Skin.setConcealer(concealer);
        String contour = scanner.nextLine();
        Skin.setContour(contour);
        String primer = scanner.nextLine();
        Skin.setPrimer(primer);
        s.insert(foundation, Skin.foundationl);
        s.insert(concealer,Skin.concealerl);
        s.insert(contour,Skin.contourl);
        s.insert(primer,Skin.primerl);

    }


}
