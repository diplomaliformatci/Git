package Ders2_1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphPanel extends JPanel{
	String paneltext = "default text";
	int x=0;
	int y=0;
	Dimension size;
			public GraphPanel(String paneltext , int x, int y,Dimension size){
				this.paneltext = paneltext;
				this.x = x;
				this.y = y;
				this.size = size;
				this.setOpaque(false);
				super.setOpaque(false);
			}
			public void adjustSize(){
				this.setPreferredSize(size);
				this.setSize(size);
				
			}
			public void paintComponent (Graphics g){
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D)g;
				g2d.drawLine(x, y, x+=50, y+=50);
				adjustSize();
				g2d.drawString(this.paneltext,this.x,this.y);
			}
}
