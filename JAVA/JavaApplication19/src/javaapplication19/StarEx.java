/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
class Surface extends JPanel {
 
   private final double points[][] = {
       { 0, 85 }, { 75, 75 }, { 100, 10 }, { 125, 75 },
       { 200, 85 }, { 150, 125 }, { 160, 190 }, { 100, 150 },
       { 40, 190 }, { 50, 125 }, { 0, 85 }
   };
   
   private void doDrawing(Graphics g) {
       
       Graphics2D g2d = (Graphics2D) g.create();
 
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
 
       g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY);
 
       g2d.setPaint(Color.red);
       g2d.translate(50, 50);
       GeneralPath star = new GeneralPath();
       star.moveTo(points[0][0], points[0][1]);
//            for (int i=0 ; i<1000 ; i+=100){

            //}
       g2d.setPaint(Color.BLUE);
            g2d.fill(star);
       for (int k = 1; k < points.length; k++)
           star.lineTo(points[k][0], points[k][1]);
 
       star.closePath();
       g2d.fill(star);        
       
       g2d.dispose();
   }
 
   @Override
   public void paintComponent(Graphics g) {
       super.paintComponent(g);
       
       doDrawing(g);
   }
}
 
public class StarEx extends JFrame {
   
   public StarEx() {
 
       initUI();
   }    
   
   private void initUI() {
       
       add(new Surface());
       
       setTitle("Star");
       setSize(350, 250);
       setLocationRelativeTo(null);          
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
 
       EventQueue.invokeLater(new Runnable() {
           
           @Override
           public void run() {
               StarEx ex = new StarEx();
               ex.setVisible(true);
           }
       });
   }    
}