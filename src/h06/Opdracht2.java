package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    int uur, dag, jaar;

public void init(){

     uur = (60*60);
     dag = (3600*24);
    jaar =(86400*365);

}
public void paint (Graphics g){
    g.drawString("uur = " +uur, 20, 20);
    g.drawString("dag = " +dag, 20, 40);
    g.drawString("jaar = " +jaar, 20, 60);


}



}
