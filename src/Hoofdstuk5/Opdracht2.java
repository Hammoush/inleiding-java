package Hoofdstuk5;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int valerei;
    int jerroen;
    int Hans;


    public void init() {
        valerei = 40;
        jerroen = 100;
        Hans =80;
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("valerie", 5, 115);
        g.fillRect(110, 90,valerei, 30);
        g.setColor(Color.blue);
        g.drawString("Jerroen", 5, 150);
        g.fillRect(110, 130, jerroen, 30 );
        g.setColor(Color.black);
        g.drawString("Hans",5, 180);
        g.fillRect(110, 170,Hans, 30);


    }

}













