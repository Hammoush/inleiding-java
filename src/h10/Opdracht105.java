package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht105 extends Applet {
    TextField tekstvak;
    TextField teksvak1;
    Label label;
    Label label1;
    String s, tekst;
    String j, tekst2;
    int maand;
    int jaar;

    public void init() {
        tekst = "";
        tekst2 = "";
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new TekstvakListener() );
        label = new Label("Type het maandnummer en druk op enter");

        teksvak1 = new TextField("", 20);

        teksvak1.addActionListener( new Tekstvak1Listener() );
        label1 = new Label("Type het jaarnummer en druk op enter");
        tekst = "";
        add(label);
        add(tekstvak);
        add(label1);
        add(teksvak1);
    }

    public void paint(Graphics g) {
        g.drawString(tekst + tekst2, 40, 90 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "januari 31 dagen ";
                    break;
                case 2:
                    tekst = "februari 28 ";
                    break;
                case 3:
                    tekst = "maart 31 ";
                    break;
                case 4:
                    tekst = "April 30 ";
                    break;
                case 5:
                    tekst = "mei 31 ";
                    break;
                case 6:
                    tekst = "juni 30 ";
                    break;
                case 7:
                    tekst = "julie 31 ";
                    break;
                case 8:
                    tekst = "Augustus 31 ";
                    break;
                case 9:
                    tekst = "september _30 ";
                    break;
                case 10:
                    tekst = "oktober _31 ";
                    break;
                case 11:
                    tekst = "november _30 ";
                    break;
                case 12:
                    tekst = "december_31 ";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..! ";
                    break;
            }
            repaint();
        }
    }
        class Tekstvak1Listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                s = teksvak1.getText();
                jaar = Integer.parseInt( s);
                if ( ((jaar % 4 == 0)) ||
                        jaar % 400  == 0 ) {
                    tekst2 = ""+ jaar + " is een schrikkeljaar";
                }
                else {
                    tekst2 = ""+ jaar + " is geen schrikkeljaar";
                }

                repaint();
    }
}
}

