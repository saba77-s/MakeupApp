package ui;

import model.Ambassador;
import model.Member;
import network.WebReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static java.awt.BorderLayout.BEFORE_FIRST_LINE;

public class SignUp {

    public void signUp() {
        JFrame f = new JFrame("Sabmetics");
        f.getContentPane().setBackground(Color.PINK);
        f.setVisible(true);
        final JTextField tf = new JTextField("Enter your email here!");
        final JTextField tff = new JTextField("Enter your name here!");
        tff.setBounds(90, 80, 220, 20);
        JButton bb = new JButton("What do you want us to call you?");
        bb.setBounds(90, 100, 220, 60);
        signUpHelper(bb, f, tff, tf);
    }

    public void signUpHelper(JButton bb, JFrame f, JTextField tff, JTextField tf) {
        bb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Member m = new Member(signUpHelperHelp(f,tff));
                m.setName(signUpHelperHelp(f,tff));
                JFrame j = new JFrame("email sign up");
                j.add(new JLabel("Do you want to become a sabmetics member " + m.getName() + " ?"));
                j.setLayout(null);
                j.add(new JLabel("Do you want to become a sabmetics member " + m.getName() + " ?"));
                JButton y = new JButton("Yes");
                y.setBounds(80, 100, 50, 50);
                actionHelperYoYo(y,j,tf,m);
                j.add(y);
                j.add(actionHelperYoYo(y,j,tf,m));
                j.setSize(400, 400);
                j.setVisible(true);
            }
        });
        signUpHelperHelper(f,bb,tff);
    }

    public String signUpHelperHelp(JFrame f,JTextField tff) {
        f.setVisible(false);
        tff.setVisible(false);
        String name = tff.getText();
        return name;
    }

    public JButton actionHelperYoYo(JButton y,JFrame j,JTextField tf,Member m) {
        y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j.setVisible(false);
                JFrame em = new JFrame();
                helperV(tf,em);
                tf.setBounds(10, 50, 200, 50);
                JButton ok = new JButton("Sign me up");
                ok.setBounds(10, 100, 90, 50);
                em.setVisible(true);
                em.add(ok);
                ok.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        actionPerformedHelper(tf,m,em);
                    }
                });
            }
        });
        return hateCheckStyle(j);
    }

    public void helperV(JTextField tf,JFrame em) {
        em.setLayout(null);
        em.setSize(400, 400);
        em.add(tf);
    }

    public JButton hateCheckStyle(JFrame j) {
        JButton n = new JButton("No");
        n.setBounds(200, 100, 50, 50);
        n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.setVisible(false);
                userReqPage();
            }
        });
        return n;
    }

    public void actionPerformedHelper(JTextField tf,Member m,JFrame em) {
        String email = tf.getText();
        m.setEmail(email);
        JOptionPane.showMessageDialog(null, m.getEmail() + " has been signed up!");
        em.setVisible(false);
        userReqPage();
    }


    public void signUpHelperHelper(JFrame f,JButton bb,JTextField tff) {
        f.setBackground(Color.pink);
        f.add(bb);
        f.add(tff);
        f.setSize(400, 400);
        f.setLayout(null);
    }


    public void userReqPage() {
        JFrame r = new JFrame("Select what you're looking for");
        r.getContentPane().setBackground(Color.PINK);
        r.setBackground(Color.pink);
        JButton quit = new JButton("Quit");
        quit.setBounds(10, 90, 50, 60);
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                r.setVisible(false);
            }
        });
        userReqPageHelp(r,quit);
    }

    public void userReqPageHelp(JFrame r,JButton quit) {
        JButton addFave = new JButton("set your faves");
        JButton onlineShop = new JButton("Online shop");
        JButton ambassador = new JButton("Become an embassador!");
        onlineShop.setBounds(70,90,100,60);
        ambassador.setBounds(180,90,170,60);
        onlineShop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformedHelperYo(r);
            }
        });

        ambassador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beAmbassador();
            }
        });
        userReqPageHelperHelper(r,quit,ambassador,onlineShop,addFave);
    }

    public void actionPerformedHelperYo(JFrame r) {
        r.setVisible(false);
        WebReader webReader = new WebReader();
        try {
            webReader.webReader();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void userReqPageHelperHelper(JFrame r, JButton quit,JButton ambassador,JButton onlineShop,JButton addFave) {
        addFave.setBounds(100,150,100,60);
        addFave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fave f = new Fave();
            }
        });
        r.add(addFave);
        r.add(quit);
        r.add(ambassador);
        r.add(onlineShop);
        r.setSize(400,400);
        r.setLayout(null);
        r.setVisible(true);
    }

    public void beAmbassador() {
        JFrame jframe = new JFrame("ambassador application");
        JTextField jt = new JTextField("Number of followers");
        jt.setBounds(50,100,200,50);
        JTextField jtt = new JTextField("name");
        jtt.setBounds(50,50,200,50);
        JButton jbutton = new JButton("submit");
        jbutton.setBounds(70,200,100,50);
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String followers = jt.getText();
                String name = jtt.getText();
                Ambassador ambassador = new Ambassador(followers,name);
                JOptionPane.showMessageDialog(null,ambassador.getName() + "'s application has been submitted");
                jframe.setVisible(false);
            }
        });
        beAmbassadorhelp(jframe,jbutton,jt,jtt);
    }

    public void beAmbassadorhelp(JFrame jframe,JButton jbutton,JTextField jt,JTextField jtt) {
        jframe.setVisible(true);
        jframe.add(jbutton);
        jframe.setSize(400,400);
        jframe.add(jt);
        jframe.add(jtt);
        jframe.setLayout(null);
    }
}
