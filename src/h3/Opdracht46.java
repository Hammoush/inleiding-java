package h3;

import java.applet.Applet;
import java.awt.*;

public class Opdracht46 extends Applet {
   public void init(){
    setBackground(Color.magenta);
    setSize(400, 400);


   }
    public void paint(Graphics g){
    g.setColor(Color.black);
    g.fillRect(103, 300, 3, 150);
    g.setColor(Color.green);
    g.fillOval(80, 250, 50, 50);
    g.setColor(Color.orange);
    g.fillOval(80, 200, 50, 50 );
    g.setColor(Color.red);
    g.fillOval(80,150, 50, 50 );



    }






}
