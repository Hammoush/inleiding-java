package h10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


    public class Opdracht103 extends Applet {
        TextField tekstvak;
        Label label;
        String s, tekst;
        int dag;

        public void init() {
            tekstvak = new TextField("", 20);
            label = new Label("Type het maandnummer en druk op enter");
            tekstvak.addActionListener( new TekstvakListener() );
            tekst = "";
            add(label);
            add(tekstvak);
        }

        public void paint(Graphics g) {
            g.drawString(tekst, 40, 90 );
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                dag = Integer.parseInt( s);
                switch(dag) {
                    case 1:
                        tekst = "januari 31 dagen";
                        break;
                    case 2:
                        tekst = "februari 28";
                        break;
                    case 3:
                        tekst = "maart 31";
                        break;
                    case 4:
                        tekst = "April 30";
                        break;
                    case 5:
                        tekst = "mei 31";
                        break;
                    case 6:
                        tekst = "juni 30";
                        break;
                    case 7:
                        tekst = "julie 31";
                        break;
                    case 8:
                        tekst = "Augustus 31";
                        break;
                    case 9:
                        tekst = "september _30";
                        break;
                    case 10:
                        tekst = "oktober _31";
                        break;
                    case 11:
                        tekst = "november _30";
                        break;
                    case 12:
                        tekst = "december_31";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;
                }
                repaint();
            }
        }
    }









