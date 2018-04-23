package h11;


import java.applet.Applet;
import java.awt.*;

public class Opdracht113 extends Applet {


    public void init() {


    }

    public void paint(Graphics g) {

        int teller1 = -1,teller2 = 1,teller3;

        int y = 20;

        g.drawString("",20,20);

        for(int i = 1; i < 10; i++) {
            y += 20;
            teller3= teller2+teller1;
            teller1 =teller2;
            teller2 =teller3;

            g.drawString("" + teller3,20,y);

        }



    }


}