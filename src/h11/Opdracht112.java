package h11;


import java.awt.*;
import java.applet.*;


public class Opdracht112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int uitkomst;
        int y = 20;

        for(uitkomst = 20; uitkomst >= 10; uitkomst--) {
            y +=20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + uitkomst, 305, y );
        }
    }
}

