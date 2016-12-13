package Sinav1;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ball extends JPanel implements ActionListener{
	 private Image img;
     private int sayac = 0;
     private Image img2;
     private Timer timer;
     private float alpha = 1f;
     private final int DELAY = 100;
     private final int INITIAL_DELAY = 500;
     private boolean donus = false;
     private int[] dizix = new int[10];
     private int[] diziy = new int[10];
     private int sayix;
     private int sayiy;
     private int x =20;
	 public Ball(){
		java.util.Random rand = new java.util.Random();
		for (int i=0 ; i <10 ; i++){
			dizix[i] = rand.nextInt(10);
		}
		     for (int i=0 ; i<10 ; i++){
		    	 diziy[i] = rand.nextInt(800);
		    	 for (int y=0 ; y<i ; y++){
		    		 if (diziy[i] <= diziy[y]+20 && diziy[i] >= diziy[y]-20){
		    			 diziy[i] = rand.nextInt(800);
		    		 y=0;
		    		 }
		    	 }
		     }
  	   //setSurfaceSize();
  	   initTimer();
     }
     
     private void initTimer(){
  	   timer = new Timer(DELAY,this);
  	   timer.setInitialDelay(INITIAL_DELAY);
  	   timer.start();
     }
     private void doDrawing(Graphics g){
  	   	Graphics2D g2d = (Graphics2D)g.create(); 		
  	   		for(int i=0 ; i<10 ; i++){
    		 g2d.drawOval(x*dizix[i]/10,diziy[i],20, 20);
    		 g2d.fillOval(x*dizix[i]/10,diziy[i], 20, 20);
  	   		}
  	   }
     @Override
     public void paintComponent(Graphics g){
  	   super.paintComponent(g);
  	   doDrawing(g);
  	   repaint();
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x> 780){
			donus = true;
		}
		if (donus ){
			x-=10;
			if (x <20){
				donus = false;
			}
			
		}
		else {
			x+=10;
		}
	}
     
     
}

