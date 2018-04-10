package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht83 extends Applet {


    TextField tekstvak;
    Button knop;
    Label label;
    double Btw;
    public void init(){
        knop = new Button("ok");
        knop.addActionListener(new knopListener ());
        label = new Label("brerken met uw Btw");
        tekstvak = new TextField("voer het bedrag",17);
        tekstvak.addActionListener(new knopListener());
    add(knop);
    add(tekstvak);
    add(label);
    }
    public void paint (Graphics g){
        g.drawString("de uikomst is :"+ (Btw*1.21), 30, 40);
    }
    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s =tekstvak.getText();
            Btw = Double.parseDouble(s);
            repaint();

        }
    }


}
