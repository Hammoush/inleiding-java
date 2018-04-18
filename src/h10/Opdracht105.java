package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht105 extends Applet {
    TextField teksvak;

    String tekst, s;
    double cijfer;
    Button knop;


    public void init() {
        teksvak = new TextField("", 30);

        knop = new Button("ok");
        knop.addActionListener(new knopListener());


        add(teksvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 20, 60);
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = teksvak.getText();
            cijfer = Integer.parseInt(s);


            if (cijfer > 5 && cijfer <=10) {
                tekst = cijfer + "  je bent geslaagd";
            } else if (cijfer < 5 && cijfer >= 1) {
                tekst = cijfer + "  je ben gezakt";
            } else {
                tekst = "Ongeldig nummer";
            }

            repaint();
        }

    }
}
