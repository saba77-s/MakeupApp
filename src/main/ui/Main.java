package ui;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        firstmethod();
        Member u = new Member();
        u.name = scanner.nextLine();
        String ans = "";
        Scanner b = new Scanner(System.in);
        System.out.println("Do you want to become a member to get the latest updates " + u.name + " Y/N?");
        ans = scanner.nextLine();
        if (u.email == "") {
            if (ans.equals("Y")) {
                System.out.println("please enter your email address!");
                u.email = b.nextLine();
                secondmethod(u.name);
                thirdmethod();
            }
        }
    }

    public static void thirdmethod() {
        while (true) {
            Scanner inp;
            inp = new Scanner(System.in);
            System.out.println("Please select what you're looking for or type quit:");
            String product = inp.nextLine();
            System.out.println("you selected: " + product);
            if (product.equals("quit")) {
                break;
            }
            if (product.equals("add favourite")) {
                favourite();
            }
            if (product.equals("foundation")) {
                System.out.println("Sabmetics approved " + "foundations are:");
                System.out.println(ui.Skin.foundationl);
            }
            if (product.equals("concealer")) {
                System.out.println("Sabmetics approved concealers are:");
            }
        }


    }

    public static void firstmethod() {
        System.out.println("HEY,Welcome to Sabmetics please enter your name! :)");
    }

    public static void secondmethod(String arg) {
        System.out.println("Congrats! " + arg + " You're a Sabmetics member.");
    }

    public static void favourite() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("please specify the type of your fave product ");
        String foundation = scanner.nextLine();
        String concealer = scanner.nextLine();
        String contour = scanner.nextLine();
        String primer = scanner.nextLine();
        Skin skin = new Skin(foundation,concealer,contour,primer);
        skin.insertf(foundation);

    }
}
