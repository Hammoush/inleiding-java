package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht102 extends Applet {
    TextField tekstvak;
    String tekst;
    Label label;
    private int laagstegetal,hoogstegetal;


    public void init() {
        setSize(400, 300);
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvlakListener());
        tekst = "";
        label = new Label("invoer");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("hoogstegetal " + hoogstegetal, 40, 40);
        g.drawString("laagstegetal " + laagstegetal, 40, 60);
    }

    class TekstvlakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int getal = Integer.parseInt(tekstvak.getText());
            if (getal > hoogstegetal) {
                hoogstegetal = getal;
                repaint();
            }
            else if (getal < hoogstegetal) {
                laagstegetal = getal;
                repaint();
            }

        }}}
