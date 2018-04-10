package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {

         Button man;
         Button vrouw;
        Button potentiële;
         Button mannlijk;
        int teller;
        int teller2;
        int totaal;
        int teller3;
        int teller4;
    public void init(){
        knopListener kl =new knopListener();
        man = new Button("m");
        man.addActionListener(new knopListener());
        vrouw =new Button("v");
        vrouw.addActionListener(new vrouw());
        potentiële = new Button("p");
        potentiële.addActionListener(new potentiële());
        mannlijk = new Button("ma");
        mannlijk.addActionListener(new mannlijk());
        teller =0;
        teller2 =0;
        teller3 =0;
        teller4 =0;


        add(man);
        add(vrouw);
        add(potentiële);
        add(mannlijk);


    }
public void paint (Graphics g){

            g.drawString("totaal van de mannen  : "+teller,20, 40);
            g.drawString("totaal van de vrouwen  : "+teller2,20, 60);
             g.drawString("totaal van de potentiële   : "+teller3,20, 80);
             g.drawString("totaal van de mannelijk  : "+teller4,20, 100);

            g.drawString("totaal van allemaal  : "+totaal,20, 120);
    totaal=teller + teller2 +teller3 +teller4 ;
}
class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            teller++;
            totaal++;
            repaint();

        }}
    class vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }
    class potentiële  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller3++;
            totaal++;
            repaint();

}}
    class mannlijk  implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller4++;
            totaal++;
            repaint();
        }}
    }
