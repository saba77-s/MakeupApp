package ui;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        firstmethod();
        String ans = "";
        System.out.println("Do you want to become a member to get the latest updates Y/N?");
        ans = scanner.nextLine();
        if (ans.equals("Y")) {
            Scanner b = new Scanner(System.in);
            member u = new member();
            System.out.println("please enter your email address!");
            u.email = b.nextLine();
            secondmethod(ans);
        }

        while (true) {
            Scanner inp;
            inp = new Scanner(System.in);
            System.out.println("Please select what you're looking for or type quit:");
            String product = "";
            product = inp.nextLine();
            System.out.println("you selected: " + product);
            if (product.equals("quit")) {
                break;
            }
            if (product.equals("foundation")) {
                System.out.println("Sabmetics approved foundSabais77+" +
                        "ations are:");
                System.out.println(ui.skin.Foundation());
            }
            if (product.equals("concealer")) {
                System.out.println("Sabmetics approved concealers are:");
                System.out.println(ui.skin.Concealers());
            }
        }


    }

    public static void firstmethod(){
        System.out.println("HEY,Welcome to Sabmetics!");
    }

    public static void secondmethod(String arg){
        System.out.println("Congrats!"+arg+"You're a Sabmetics member.");
    }
}