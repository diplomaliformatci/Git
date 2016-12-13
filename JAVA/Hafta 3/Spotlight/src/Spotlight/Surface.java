package Spotlight;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

			public class Surface extends JPanel{
private final int RADIUS = 50;
private Image image;
private int iw;
private int ih;
private int x;
private int y;
private boolean mouseln;
		public Surface(){
			initUI();
		}
		private void initUI(){
			loadImage();
		iw = image.getWidth(null);
		ih = image.getHeight(null);
		addMouseMotionListener(new MyMouseAdapter());
		addMouseListener(new MyMouseAdapter());
		}
		private void loadImage(){
			image = new ImageIcon("/Users/cankincal/Desktop/IMG_5850.jpg").getImage();
		}
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			doDrawing(g);
		}
		private void doDrawing(Graphics g){
			Graphics2D g2d = (Graphics2D) g.create();
			int midX = (getWidth()-iw)/2;
			int midY = (getHeight()-ih)/2;
			BufferedImage bi = new BufferedImage(getWidth(),getHeight(),BufferedImage.TYPE_INT_ARGB);
			Graphics2D bigr = bi.createGraphics();
			if (mouseln){
				bigr.setPaint(Color.white);
				bigr.fillOval(x-RADIUS, y-RADIUS, RADIUS*2, RADIUS*2);
				bigr.setComposite(AlphaComposite.SrcAtop);
				bigr.drawImage(image, midX, midY, iw, ih, this);
			}
			bigr.setComposite(AlphaComposite.SrcOver.derive(0.1f));
			bigr.drawImage(image, midX, midY, iw, ih, this);
			bigr.dispose();
			g2d.drawImage(bi, 0, 0, getWidth(), getHeight(), this);
			g2d.dispose();
		}
		public class MyMouseAdapter extends MouseAdapter {
			@Override
			public void mouseExited(MouseEvent e){
				mouseln = false;
			//	repaint();
			}
			@Override
			public void mouseEntered(MouseEvent e){
				mouseln = true;
				
			}
			@Override
			public void mouseMoved(MouseEvent e){
			x= e.getX();
			y= e.getY();
			repaint();
			}
	}
		public class Buttons extends JButton {
		public Buttons(){
			g
		}
		}
		
		
			}
		
		

