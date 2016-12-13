package sun_nd_cloud;

import java.awt.AlphaComposite;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
public class Surface extends JPanel implements ActionListener{
			private Image sun;
			private Image cloud;
			private Timer timer;
			private float alpha = 1f;
			private final int DELAY = 60;
			public Surface(){
				loadImages();
				initTimer();
			}
			private void loadImages(){
				sun = new ImageIcon("/Users/cankincal/Desktop/ekran görüntüleri/Ekran Resmi 2016-07-24 19.44.25.png").getImage();
				cloud = new ImageIcon("/Users/cankincal/Desktop/ekran görüntüleri/Ekran Resmi 2016-07-24 18.22.16.png").getImage();
			}
			private void initTimer(){
				timer = new Timer(DELAY,this);
				timer.start();
			}
			private void doDrawing(Graphics g){
				Graphics2D g2d =(Graphics2D) g.create();
				BufferedImage buffimg = new BufferedImage(220,140,BufferedImage.TYPE_INT_ARGB);
				Graphics2D gbi = buffimg.createGraphics();
				AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha);
				gbi.drawImage(sun, 0, 0,null);
				gbi.setComposite(ac);
				//gbi.drawImage(cloud, 0, 0, null);
				gbi.drawImage(cloud, 20,20, null);
				g2d.drawImage(buffimg, 20, 20,null);
				gbi.dispose();
			g2d.dispose();
			}
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				doDrawing(g);
			}
			private void step(){
				alpha -= 0.1;
				if (alpha <= 0){
					alpha = 0 ;
					timer.stop();
				}
			}
			@Override
			public void actionPerformed(ActionEvent e){
				step();
				repaint();
			}
}
