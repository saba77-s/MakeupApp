package ui;

import model.FaceCare;
import model.FaceCosmetic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fave extends JFrame {
    private JTextField type;
    private JLabel field;
    FaceCare faceCare = new FaceCare();
    FaceCosmetic faceCosmetic = new FaceCosmetic();
    JButton scrub = new JButton("scrub");
    JButton eyeCream = new JButton("eye cream");
    JButton foundation = new JButton("foundation");
    JButton faceWash = new JButton("face wash");
    JButton moisturizer = new JButton("moisturizer");
    JButton concealer = new JButton("concealer");
    JButton contour = new JButton("contour");
    JButton primer = new JButton("primer");


    public Fave() {
        super("loves it");
        getContentPane().setBackground(Color.PINK);
        add(scrub);
        scrub.setBounds(10,250,50,50);
        add(eyeCream);
        eyeCream.setBounds(60,250,80,50);
        add(foundation);
        foundation.setBounds(140,250,80,50);
        add(faceWash);
        faceWash.setBounds(220,250,80,50);
        add(moisturizer);
        moisturizer.setBounds(300,250,100,50);
        add(concealer);
        concealer.setBounds(70,300,80,50);
        add(contour);
        contour.setBounds(150,300,80,50);
        add(primer);
        primer.setBounds(200,300,80,50);
        type = new JTextField();
        scrub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCare.setScrub(s);
                JOptionPane.showMessageDialog(null,faceCare.getScrub() + " is your new fave scrub!");
            }
        });
        eyeCream.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCare.setEyeCream(s);
                JOptionPane.showMessageDialog(null,faceCare.getEyeCream() + " is your new fave eye cream!");
            }
        });
        foundation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCosmetic.setFoundation(s);
                JOptionPane.showMessageDialog(null,faceCosmetic.getFoundation() + " is your new fave foundation");
            }
        });
        faceWash.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCare.setFaceWash(s);
                JOptionPane.showMessageDialog(null,faceCare.getFaceWash() + " is your new fave face wash");
            }
        });
        moisturizer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCare.setMoisturizer(s);
                JOptionPane.showMessageDialog(null,faceCare.getMoisturizer() + " is your new fave moisturizer");
            }
        });
        concealer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCosmetic.setConcealer(s);
                JOptionPane.showMessageDialog(null,faceCosmetic.getConcealer() + " is your new fave concealer");
            }
        });
        contour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCosmetic.setContour(s);
                JOptionPane.showMessageDialog(null,faceCosmetic.getContour() + " is your new fave contour");
            }
        });
        primer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = type.getText();
                faceCosmetic.setPrimer(s);
                JOptionPane.showMessageDialog(null,faceCosmetic.getPrimer() + " is your new fave primer");
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.pink);
        setSize(400,400);
        setLayout(null);
        type.setBounds(80,20,100,50);
        field = new JLabel("name");
        field.setBounds(20,20,70,50);
        add(field);
        add(type);

    }
}
