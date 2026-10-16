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
      //this.drawBullsEye(g);
      this.olympicrings(g);
      this.trafficLight(g);

   }

   public void drawBullsEye(Graphics g){
      g.setColor(Color.red);
      g.fillOval(75, 75, 200, 200);
      g.setColor(Color.black);
      g.fillOval(100, 100, 150, 150);
      g.setColor(Color.red);
      g.fillOval(125, 125, 100, 100);
      g.setColor(Color.black);
      g.fillOval(150, 150, 50, 50);
      g.setColor(Color.red);
   
   

   }

   public void olympicrings(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(75, 70, 100, 100);
      g.setColor(Color.yellow);
      g.drawOval(125, 70, 100, 100);
      g.setColor(Color.green);
      g.drawOval(175, 70, 100, 100);
   }


   public void trafficLight(Graphics g){

   }


   public static void main(String[] args) {
   new Shapes();

   }
}
