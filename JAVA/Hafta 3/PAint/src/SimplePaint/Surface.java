package SimplePaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;



public class Surface extends JPanel{
			Image image;
			int x,y,x2,y2;
			boolean mouseln;
	Graphics2D draw;
	public Surface(){
		this.add(con);
		initUI();
		
	}
	private void initUI(){
	addMouseMotionListener(new MyMouseAdapter());
	addMouseListener(new MyMouseAdapter());
	}
				@Override
				public void paintComponent(Graphics g){
					 if(image==null){
			             image = createImage(getSize().width, getSize().height);

			             draw = (Graphics2D)image.getGraphics();

			             draw.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			             draw.setPaint(Color.white);
			             draw.fillRect(0, 0, getSize().width, getSize().height);
			             draw.setPaint(Color.black);
			             repaint();
			    }
					 	super.paintComponent(g);
					 	repaint();
			            g.drawImage(image, 0, 0, null);
			            doDrawing(g);
				}
				public void doDrawing(Graphics g){
				//	Graphics2D g2d = (Graphics2D) g.create();
					draw.drawLine(x, y, x2, y2);
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
					}
			}
}
