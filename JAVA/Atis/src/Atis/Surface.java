package Atis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Surface extends JPanel implements ActionListener{
	  			private float hiz =50;
	  			private final float g = (float) 9.8;
	  			private Timer time;
	  			private float h;
	  			private int x1=100, x2;
	  			private int y1=300, y2;
	  			private final int DELAY = 50;
	  			private final double Pi = Math.PI;
	  			private final int DELAY2 = 1024;
	  			private  int aci = 50;
	  			private int sayac = 0;
	  			private Timer timer;
	  			boolean mevcut = true;
	  			private float artismiktarix;
	  			private float artismiktariy;
	  			private int adimsayisi;
	  			private double hizx = cosdonusturucu(aci)*hiz;
	  			private double hizy = sindonusturucu(aci)*hiz;
	  			boolean secim = true;
	  			boolean secim1 = true;
	  			boolean secim2 = true;
	  			boolean sekme = false;
	  			boolean sekme2 = false;
	  			int baslangicxx = x1;
	  			int baslangicyy = y1;
	  			private double surtunme = 0.01f;
	  		     public Surface(){
	  				initTimer();
	  				surecHesapla();
	  			}
	  		   

			private void doDrawing(Graphics g){
				Graphics2D g2d = (Graphics2D) g.create();
				g2d.drawLine(0, baslangicyy,getWidth(),baslangicyy);
			         g2d.drawOval(x1, y1, 30, 30);
			        
			}
			@Override
			public void paintComponent(Graphics g){
				//move();
				super.paintComponent(g);
				doDrawing(g);
				repaint();
				JButton blueButton = new JButton("Retry");
				blueButton.addActionListener(new ActionListener(){
					public void actionPerformed (ActionEvent e){
						x1 = baslangicxx;
						y1 = baslangicyy;
						java.util.Random rand = new java.util.Random();
						aci = rand.nextInt(90);
					}
				});
				blueButton.setSize(150,40);
				this.add(blueButton);
				
			}
			
			private void surecHesapla(){
		
			
			
			}
			
			private void movex(){
				if(x1 > getWidth())
			x1 -= hizx;
				
			}
			private void movey(){
				if (secim)
                            if (mevcut){
                            	y1 -= hizy;
                            	hizy -= g;
                            	if (hizy < 0){
                            		mevcut = false;		
                            	}
                            }
                            else {
                            	y1 += hizy;
                            	hizy += g;	
                            	if (y1 > baslangicyy-30 )
                            		secim = false;
                            }
				
				
			}
			private void sektir(){
			/*	if (hizx > 5){
				if (secim1){
					hizy -= g;
					y1 -= hizy;
					if (hizy < 0 ){
						secim1 = false;
					}
				}
				else {
					if (y1 > baslangicyy-30){
						secim1 = true;
					}
					hizy += g;
					y1 += hizy;
				}
				}*/
				mevcut = true;
				
			
			}
			private double cosdonusturucu (int aci){
				return Math.cos(aci*Pi/180);
			}
			private double sindonusturucu (int aci){
				return Math.sin(aci*Pi/180);
			}
			
			
	private void initTimer(){
		time = new Timer(DELAY,this);
		time.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) { 
		//hizy-=surtunme*hizy;
		//hizx-=surtunme*hizx;
	movex();
	movey();
	if (!secim)
		sektir();
	//timer i yonlendr 
	}
	

	
}
