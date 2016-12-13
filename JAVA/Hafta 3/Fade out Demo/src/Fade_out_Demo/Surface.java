package Fade_out_Demo;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Surface extends JPanel implements ActionListener{
       private Image img;
       private int sayac = 0;
       private Image img2;
       private Timer timer;
       private float alpha = 1f;
       private final int DELAY = 50;
       private final int INITIAL_DELAY = 500;
       public Surface(){
    	   loadImage();
    	   setSurfaceSize();
    	   initTimer();
       }
       private void loadImage(){
    	   img = new ImageIcon ("/Users/cankincal/Desktop/ekran görüntüleri/Ekran Resmi 2016-07-24 19.44.25.png").getImage();
    	   img2 = new ImageIcon ("/Users/cankincal/Desktop/ekran görüntüleri/Ekran Resmi 2016-07-24 18.22.16.png").getImage();
    	   
       }
       private void setSurfaceSize(){
    	   int h = img.getHeight(this);
    	   int w = img.getWidth(this);
    	   setPreferredSize(new Dimension ( w,h));
       }
       private void initTimer(){
    	   timer = new Timer(DELAY,this);
    	   timer.setInitialDelay(INITIAL_DELAY);
    	   timer.start();
       }
       private void doDrawing(Graphics g){
    	   if (sayac == 3000){
    		   sayac=0;
    	   }
    	   if (sayac <= 100){
    	   Graphics2D g2d = (Graphics2D) g.create();
    	   AlphaComposite acomp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha);
    	   //AlphaComposite acomp2 =  AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha);
    	   g2d.setComposite(acomp);
    	   g2d.drawImage(img, 0, 0, null);
    	   System.out.println(sayac);
    	   sayac++;
    	   }
    	   else{
    		   Graphics2D g2d = (Graphics2D) g.create();
        	   
    		   AlphaComposite acomp2 =  AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha);
    	   g2d.setComposite(acomp2);
    	   g2d.drawImage(img2,	0, 0, null);
    	   g2d.dispose();
    	   sayac++;
    	   }
    	   }
       @Override
       public void paintComponent(Graphics g){
    	   super.paintComponent(g);
    	   doDrawing(g);
       }
       private void step(){
    	   if (alpha >= 10)
    	   alpha += -0.01f;
    	   else {
    		   alpha += +0.01f;
    		   
    		 //  timer.stop();
    	   }
       }
    /*   private void step2(){
    	// AlphaComposite.getInstance(rule, alpha)
    	   alpha += +0.01f;
    	   if (alpha >= 255){
    		   alpha = 255;
    	   }
    	   timer.stop();
       } */
       
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		step();
		//repaint();
		//step2();
		repaint();
		
	}
       
       
}
