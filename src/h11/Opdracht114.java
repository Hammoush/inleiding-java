package h11;


import java.applet.Applet;
import java.awt.*;

public class Opdracht114 extends Applet {

    public void init() {


    }


    public void paint(Graphics g) {
        int y=0;

        for (int i = 0; i <= 10; i++) {
            y += 20;

            g.drawString(i + " * 3 = " + i * 3,20,y);
            g.drawString(i + " * 4 = " + i * 4,100,y);
        }




    }
}