package Hoofdstuk5;



import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet{
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.red;
        breedte = 200;
        hoogte = 100;
        setSize(700,700);


    }
        public void paint (Graphics g){
            g.setColor(lijnkleur);
            g.drawRect(100,100, breedte,hoogte);
          g.drawRoundRect(100, 225, breedte, hoogte, 60, 60);
            g.setColor(lijnkleur);
            g.fillRect(315, 100, breedte, hoogte);
            g.setColor(opvulkleur);
            g.fillOval(315,100,breedte, hoogte);
g.setColor(opvulkleur);
g.fillOval(315,225, breedte,hoogte);
            g.setColor(lijnkleur);
                g.drawOval(550,100,breedte,hoogte);
            g.setColor(opvulkleur);
                g.fillArc(550,100,breedte,hoogte,90,45);
            g.setColor(lijnkleur);
            g.drawOval(600,225,80, 80);

        }





    }









