package Atis2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Surface extends JPanel implements ActionListener{
			private int DELAY= 25;
			private int sayac = 0;
			private Timer time;
			private final int baslangicx = 30;
			private final int baslangicy = 360;
			private int aci=70;
			private double x = baslangicx;
			private double y = baslangicy;
			private boolean left = true;
			private int gecicihiz;
			private double hiz = 50;
			private boolean dikeysecim = true;
			private boolean button = true;
			private  double gravity = 3.8f ;
			private String Degisken = "On";
			private boolean count = false;
			private double hizx =hiz * cosdonustur(aci);
			private double hizy =sindonustur(aci)*hiz;
					protected Surface(){
						initTimer();
						
					}
					private void hesapla (double hizx,double hizy,double hiz){
						this.hizx = hiz * cosdonustur(aci);
						this.hizy =sindonustur(aci)*hiz ;
					}
					
					@Override
					protected void paintComponent(Graphics g){
						super.paintComponent(g);
						doDrawing(g);
						repaint();
						if (!count)
						{ count = true;
						JButton button1 = new JButton (Degisken);
						button1.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								if (button){
									button = false;
									Degisken = "OFF";
								}
									else{ 
									button = true;
									Degisken = "ON";
									}
							}
						}); // "Slower" cikis
						JButton retry = new JButton ("Retry");
						retry.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								sayac++;
								
									time.stop();
									if (sayac == 2){
										x = (double)baslangicx;
										y = (double)baslangicy;
										hiz = 50;
										hesapla (hizx ,hizy , hiz);
										java.util.Random rand = new java.util.Random();
										aci =rand.nextInt(45)+45;
										sayac = 0;
										time.start();
									}
									
							}
						}); // "Retry" cikis
						
						JButton kick = new JButton ("Kick");
						kick.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
							
								hiz += 30;
								hesapla (hizx , hizy ,hiz);
							
								//gecicihiz = (int)hiz;
							}
						});
						JButton plus = new JButton ("+");
						plus.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
							  gravity = gravity + (double)0.8;
							}
						}); // "+" cikis 
						JButton decrease = new JButton ("-");
						decrease.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								gravity = gravity - (double)0.8;
							}
						}); // " - "  cikis
						decrease.setSize(30,30);
						plus.setSize(30,30);
						retry.setSize(100,60);
						decrease.setLocation(200,30);
						plus.setLocation(200,0);
			retry.setLocation(0, 0);
			button1.setLocation(100, 0);
				button1.setSize(100,60);
				kick.setSize(100,50);
				kick.setLocation(230, 0);
				this.add(decrease);
				this.add(plus);
				this.add(button1);
				this.add(retry);
				this.add(kick);
						}
				
					} // component cikis
					private void doDrawing(Graphics g){
						Graphics2D g2d =(Graphics2D)g.create();
						g2d.drawLine(0, 400,getWidth(), 400);
						g2d.drawOval((int)x, (int)y, 30, 30);
						g2d.dispose();
						
					}  // g2d cikis
					private void initTimer(){
					 time = new Timer(DELAY, this);
						time.start();
						time.isRepeats(); //unknown
					} // timer cikis
					private void dikeyatis(){
							if (gecicihiz < 0){
								dikeysecim = false;
								gecicihiz = 0;//(int)hiz;
							}// gecicihiz if ciksii
							if (y >= 370){
								if (button){
								y = 369;
								}// cizgiye sabitle 
								dikeysecim = true;
								gecicihiz = (int)hiz;
							}	// cizgi kontrol if cikisi
							if (dikeysecim){
							y -= (double)(hizy*gecicihiz)/75;
						gecicihiz -= gravity;} // koordinat dikey cikisi
							else {
								y += (double)(hizy *gecicihiz )/75;
								gecicihiz += gravity;
								
							} // kordinat dusey cikisi
							
						
						
					}
					private void yatayatis(){
						if (hiz < 1){
							x+=0;
						}
						else {
						if (x >= getWidth() - 30){
							left = false;
						} // carpma sag if cikis
						if (x <= 0 ){
							left = true;
						} // carpma sol if cikis
						
						if (left){
							x+= hizx;
						}
						else{
							x-= hizx;
						}	
						}
					}
					@Override
					public void actionPerformed(ActionEvent e) {
						if(button){
						yatayatis();
						dikeyatis();
						} // timer vs olay
						else
						{
							if (hiz >= 0)
								if (hiz < 1){
									hiz = 0;
								} // hata kirma if cikisi
							hiz -= hiz/75;
							hesapla(hizx , hizy, hiz);
							yatayatis();
							dikeyatis();
						} // timer vs olay secim 2
					}
							private double cosdonustur(int aci){
								return (double)Math.cos(aci*Math.PI/180);
							}
							private double sindonustur(int aci){
								return (double)Math.sin(aci*Math.PI/180);
							}
}
