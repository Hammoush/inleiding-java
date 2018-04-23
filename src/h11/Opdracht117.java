package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht117 extends Applet {

    public void init(){}
    public void paint (Graphics g){
    int straal = 1000, breedte = 300, hoogte = 300;
        do {
        int x=breedte/2-straal, y=hoogte/2-straal;
        g.drawOval (x, y, 2*straal, 2*straal);
        straal -= 20;
    } while (straal > 50);}}

