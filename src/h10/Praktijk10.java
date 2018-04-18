package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijk10 extends Applet {
    TextField teksvak;

    String tekst, s;
    double cijfer;
    Button knop;


    public void init() {
        teksvak = new TextField("", 30);

        knop = new Button("ok");
        knop.addActionListener(new knopListener());


        add(teksvak);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 20, 60);
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = teksvak.getText();
            cijfer = Integer.parseInt(s);


            if (cijfer >= 1 && cijfer <=3) {
                tekst = cijfer + "  uw uitkomst is slecht";
            } else if (cijfer == 4 ) {
                tekst = cijfer + "  uw uitkomst is onvoldonde";
            }  else  if (cijfer == 5 ){
                tekst =cijfer + "uw uitkomst is matig";
            }
            else if ( cijfer >=6  && cijfer<=7){
                tekst = cijfer + "uw uitkomst is voldende";
            }
            else if (cijfer >= 8 && cijfer <= 10){
                tekst = cijfer + "uw uitkomst is goed";
            }
            else {
                tekst = "Ongeldig nummer";
            }

            repaint();
        }

    }
}

