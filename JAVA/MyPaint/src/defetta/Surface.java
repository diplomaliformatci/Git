package defetta;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class Surface extends JPanel{
 Image image;
 Graphics2D g2d;
 int currentX , currentY , oldX , oldY;
 
 public void doDrawing(Graphics g){
	addMouseListener(new MouseAdapter(){
		@Override
		public void mousePressed(MouseEvent e){
			oldX = e.getX();
			oldY = e.getY();
		}
	});
	addMouseMotionListener(new MouseMotionAdapter(){
		@Override
		public void mouseDragged(MouseEvent e){
			currentX = e.getX();
			currentY = e.getY();
			if (g2d == null){
				g2d.drawLine(oldX, oldY, currentX, currentY);
			}
			repaint();
			oldX = currentX;
			oldY = currentY;
		}
	});
 }
 
 @Override
 public void paintComponent(Graphics g){
	 if (image== null){
			image = createImage(getSize().width,getSize().height);
		g2d = (Graphics2D)image.getGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//clear();
	}
	g.drawImage(image,0,0,null);
	doDrawing(g);
 }

public void clear(){
	g2d.setPaint(Color.white);
	g2d.fillRect(0, 0, getWidth(), getHeight());
	g2d.setPaint(Color.black);
	repaint();
}

}
