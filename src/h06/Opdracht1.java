package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    double Euro, aantalperson, uitkomst;


    public void init(){
     Euro = 113;
     aantalperson = 4;
      uitkomst =(Euro/aantalperson);}
      public void paint (Graphics g){
        g.drawString("Jan krijgt  = " +uitkomst, 20,20);
        g.drawString("Ali krijgt =" +uitkomst, 20,40);
        g.drawString("Jaennette krijgt  = " +uitkomst, 20,60);
        g.drawString("ik krijg    = " +uitkomst, 20,80);



    }
}
