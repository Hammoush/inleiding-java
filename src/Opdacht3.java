import java.applet.Applet;
import java.awt.*;

public class Opdacht3 extends Applet {
    public void init() {
        setBackground(new Color (255, 255, 255));

    }


    public void paint (Graphics g){
     g.setColor(new Color(21, 115, 178));
     g.drawString("Abo Hassan", 50, 50);
     g.setColor(new Color(204, 57, 57));
     g.drawString("Hamooush",120, 50);

    }

}