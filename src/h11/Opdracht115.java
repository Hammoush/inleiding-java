package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht115 extends Applet {
    public void init(){
    }
    public void paint (Graphics g){
            int y =10;
            int x =10;
       for(int i=0 ; i<10 ;i++ ){
            y +=10;
            x +=10;
           g.drawRect(x,y,10,10);



       }



    }
}
