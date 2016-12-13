package Areas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Surface extends JPanel {
	public void doDrawing (Graphics g){
	Graphics2D g2d = (Graphics2D) g;
	
	g2d.setPaint(Color.gray);
	
	Area a1 = new Area(new Rectangle2D.Double(20, 20, 100, 100));
	Area a2 = new Area(new Ellipse2D.Double(50, 50, 100, 100));
	a1.subtract(a2);
	g2d.fill(a1);
	Area a3 = new Area(new Rectangle2D.Double(150, 20, 100, 100));
	Area a4 = new Area(new Ellipse2D.Double(150, 20, 100, 100));
	a3.subtract(a4);
	//a3.subtract(a1);
	g2d.fill(a3);
	Area a5 = new Area(new Rectangle2D.Double(280, 20, 100, 100));
	Area a6 = new Area(new Ellipse2D.Double(320, 40, 100, 100));
	a5.add(a6);
	g2d.fill(a5);
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
	}
	
	
}