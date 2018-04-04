package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht81 extends Applet {

    TextField tekstvak;
    Button knop;
    Button reset;
    String hola;


    public  void init (){
        KnopListener kl = new KnopListener();
        tekstvak =new TextField("", 30);
        knop = new Button("ok");
        knop.addActionListener(kl);
        reset = new Button("reset");
        reset.addActionListener(new Reset());
        tekstvak.addActionListener(kl);
        add(tekstvak);
        add(knop);
        add(reset);
        hola ="";

    }

     public void paint(Graphics g){
      g.drawString("tepy hier abu : " + hola,20, 50 );

     }

     class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            hola = new String();
            hola = tekstvak.getText();
            repaint();
        }
     }

     class Reset implements ActionListener{
        public void actionPerformed(ActionEvent e){
            tekstvak.setText("");
            repaint();
        }

     }

}



