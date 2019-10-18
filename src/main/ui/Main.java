package ui;

import exceptions.Bought;
import exceptions.InvalidTone;
import exceptions.Null;
import model.*;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HEY,Welcome to Sabmetics  :)");
        System.out.println("Do you want to become a member to get the latest updates   Y/N?");
        String ans = scanner.nextLine();
        email(ans);
        try {
            userRequest();
        } catch (Bought bought) {
            bought.printStackTrace();
            System.out.println("make sure you haven't exceeded your monthly limit");
        } finally {
            System.out.println("money spent on mu Makeup far" + Budget.spent);
        }
    }

    public static void userRequest() throws Bought {
        System.out.println("Please select what you're looking for or type quit:");
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        while (true) {
            if (product.equals("quit")) {
                System.exit(1);
            }

            if (product.equals("manage your lists")) {
                System.out.println("add to buy list Y/N ");
                manageYourlist();
            }
            if (product.equals("foundation")) {
                System.out.println(SkinCosmetic.foundationl);
            }
            if (product.equals("concealer")) {
                System.out.println(SkinCosmetic.concealerl);
            }
        }
    }




    public static void faveCare() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("please specify your fave scrub, eye cream, face wash, moisturizer, lotion");
        String scrub = scanner.nextLine();
        SkinCare.setScrub(scrub);
        String eyeCream = scanner.nextLine();
        SkinCare.setEyeCream(eyeCream);
        String faceWash = scanner.nextLine();
        SkinCare.setFaceWash(faceWash);
        String moisturizer = scanner.nextLine();
        SkinCare.setMoisturizer(moisturizer);
        String lotion = scanner.nextLine();
        SkinCare.setLotion(lotion);
        SkinCare.insert(scrub, SkinCare.scrubl);
        SkinCare.insert(eyeCream, SkinCare.eyeCreaml);
        SkinCare.insert(faceWash, SkinCare.faceWashl);
        SkinCare.insert(moisturizer, SkinCare.moisturizerl);
        SkinCare.insert(lotion, SkinCare.lotionl);
    }



    public static void email(String ans) {
        Scanner b = new Scanner(System.in);
        if (Member.email.equals("")) {
            if (ans.equals("Y")) {
                System.out.println("please enter your email address!");
                Member.email = b.nextLine();
                System.out.println("Congrats! " + Member.name + " You're a Sabmetics member.");
            }
        }

    }


    public static void faveLip() {
        System.out.println("add to bought list,check availabilty, bought items add to favourite list");
        Scanner a = new Scanner(System.in);
        String h = a.nextLine();
        if (h.equals("add to bought list")) {
            System.out.println("please type your recent bought item");
            String b = a.nextLine();
            model.Skin.insert(b, Lips.bought);
            System.out.println("added!");
        } else if (h.equals("check availability")) {
            System.out.println("type the item's name");
            System.out.println(Lips.contains(a.nextLine(), Lips.bought));
            System.out.println("added!");
        } else if (h.equals("add to favourite")) {
            System.out.println("type the item's name");
            SkinCare.insert(a.nextLine(), Lips.fave);
            System.out.println("added!");
        }
    }

    public static void favourite() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("please type the name of your fave product ");
        String foundation = scanner.nextLine();
        SkinCosmetic.setFoundation(foundation);
        String concealer = scanner.nextLine();
        SkinCosmetic.setConcealer(concealer);
        String contour = scanner.nextLine();
        SkinCosmetic.setContour(contour);
        String primer = scanner.nextLine();
        SkinCosmetic.setPrimer(primer);
        SkinCosmetic.insert(foundation, SkinCosmetic.foundationl);
        SkinCosmetic.insert(concealer, SkinCosmetic.concealerl);
        SkinCosmetic.insert(contour, SkinCosmetic.contourl);
        SkinCosmetic.insert(primer, SkinCosmetic.primerl);

    }

    public static void manageYourlist() throws Bought {
        Scanner y = new Scanner(System.in);
        String d = y.nextLine();
        if (d.equals("Y")) {
            try {
                System.out.println("type in what you're trying to buy");
                String r = y.nextLine();
                toBuy(r);
            } catch (Null anull) {
                anull.printStackTrace();
                System.out.println("you need to add something");
                throw new Bought();
            } finally {
                System.out.println("make sure you haven't bought it already");
            }
            userRequest();
            fave(d);
        }
    }

    public static void toBuy(String r) throws Null {
        if (r.equals(" ")) {
            throw new Null();
        }
        Member.toBuy.add(r);
    }

    public static void fave(String d) {
        if (d.equals("cosmetics")) {
            favourite();
        }
        if (d.equals("skincare")) {
            faveCare();
        }
        if (d.equals("lips")) {
            faveLip();
        }
    }
}