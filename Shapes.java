/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      // g.setColor(Color.magenta);
      // g.fillOval(100, 100, 50, 50);
      // g.setColor(Color.cyan);
      // g.fillRect(150, 150, 100, 100);
      this.drawBullsEye(g);
      this.olympicrings(g);
      this.trafficLight(g);

   }

   public void drawBullsEye(Graphics g){

   }

   public void olympicrings(Graphics g){

   }


   public void trafficLight(Graphics g){

   }


   public static void main(String[] args) {
   new Shapes();

   }
}
