package ui;

import javax.swing.*;

public class Gui extends JFrame {
    public Gui() {
        super("Sabmetics");
        SignUp bt = new SignUp();
        bt.signUp();
    }
}
