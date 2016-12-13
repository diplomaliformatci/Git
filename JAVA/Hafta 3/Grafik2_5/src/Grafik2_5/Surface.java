package Grafik2_5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Surface extends JPanel{
				
	public void doDrawing (Graphics g){
		Graphics2D g2d = (Graphics2D) g.create();
	/*	g2d.setColor(new Color(255,255,255));
		g2d.fillRect(20, 20, 80, 50);
		AffineTransform tx1 = new AffineTransform();
		tx1.translate(110, 22);
		tx1.scale(0.5,0.5);
		g2d.setTransform(tx1);
		g2d.fillRect(0, 0, 80, 50);
		AffineTransform tx2 = new AffineTransform();
		tx2.translate(170, 20);
		tx2.scale(1.5, 1.5);
		g2d.setTransform(tx2);
		g2d.drawRect(0, 0, 80, 50);
		g2d.setPaint(Color.yellow);
		g2d.fillRect(0, 0, 80, 50);
		g2d.dispose();
	*/
		
		g2d.setPaint(new Color(150,130,230));
		g2d.fillRect(30, 20, 50, 50);
		g2d.setPaint(new Color(200,250,230));
		g2d.fillRect(120, 20, 90, 60);
		g2d.setPaint(new Color(200,15,130));
		g2d.fillRoundRect(250, 20, 70, 60, 25, 25);
		g2d.setPaint(new Color(140,120,50));
		g2d.fill(new Ellipse2D.Double(10, 100, 80, 100));
		g2d.setPaint(new Color(230,220,15));
		g2d.fillArc(120, 130, 110, 100, 5, 150);
		g2d.setPaint(new Color(255,140,130));
		g2d.fillOval(270, 130, 50, 50);
		g2d.setPaint(new Color(225,125,5));
				//g2d.setPaint(Color.orange);
		g2d.drawRect(30, 20, 50, 50);
		g2d.setPaint(new Color(170,180,190));
		g2d.drawRect(120, 20, 90, 60);
		g2d.setPaint(new Color(20,30,220));
		g2d.drawRoundRect(250, 20, 70, 60, 25, 25);
		g2d.setPaint(new Color(90,150,220));
		g2d.draw(new Ellipse2D.Double(10, 100, 80, 100));
		g2d.setPaint(new Color(15,175,120));
		g2d.drawArc(120, 130, 110, 100, 5, 150);
		g2d.setPaint(new Color(5,120,230));
		g2d.drawOval(270, 130, 50, 50);
	
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		doDrawing(g);
	}
}