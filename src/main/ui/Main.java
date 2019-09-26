package ui;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Integer.toString(40));
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
        System.out.println("please rate your skin tone from 1-10 (1:the lightest,10:the darkest)");
        u.skinTone = scanner.nextLine();
        userRequest();
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
                favourite();
            }
            if (product.equals("foundation")) {
                System.out.println(Skin.foundationl);
            }
            if (product.equals("concealer")) {
                System.out.println("Sabmetics approved concealers are:");
                System.out.println(Skin.concealerl);
            }
        }


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
        skin.insert(foundation, skin.foundationl);
        skin.insert(concealer,skin.concealerl);
        skin.insert(contour,skin.contourl);
        skin.insert(primer,skin.primerl);

    }
}
