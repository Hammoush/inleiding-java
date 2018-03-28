package h02;
import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
    public void init() {
        setBackground(new Color(255, 248, 220));

    }

    public void paint(Graphics g) {
        g.setColor(new Color (128, 0, 0));
g.drawString("mijn eeste Applet",50, 60 );
    }
}