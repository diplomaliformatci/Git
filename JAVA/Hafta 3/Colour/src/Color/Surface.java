package Color;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Surface extends JPanel{
//	public Surface(Graphics g){
	//	doDrawing(g);
//	}
					
	public void doDrawing(Graphics g){
					Graphics2D g2d = (Graphics2D)g;
					g2d.setColor(new Color(125,167,116));
					g2d.fillRect(10, 10, 90, 60);
					g2d.setColor(new Color(42,179,231));
					g2d.fillRect(130, 10, 90, 60);
					g2d.setColor(new Color(70,67,123));
					g2d.fillRect(10, 100, 90, 60);
					g2d.setColor(new Color(252,211,61));
					g2d.fillRect(130, 100, 90, 60);
					g2d.setColor(new Color(241,98,69));
					g2d.fillRect(250, 100, 90, 60);
					g2d.setColor(new Color(150, 130, 1, 255));
					g2d.fillRect(10, 190, 90, 60);
	}
		@Override
				public void paintComponent(Graphics g){
					super.paintComponent(g);
					doDrawing(g);
				}
}
