package Grafik2_1;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Surface extends JPanel{
	private int x1=30;
	private int y1=30;
	private int x2=40;
	private int y2=200;
	private int x3,y3;
	int sayi=10 , sayac = 9;
				public Surface (){
					x3=x2/10;
					y3=y2/10;
				}
	private void doDrawing (Graphics g){
			Graphics2D g2d = (Graphics2D)g;
			
			while (this.sayac >= 0){
				g2d.drawLine(x1, y1,x2,y2 );
				sayac--;
				x1 = x2;
				y1 = y2;
				x2 += x3;
				y2 += y3;
			

			}
			
		}
	@Override
		public void paintComponent(Graphics g){
			//super.paintComponent(g);
			doDrawing(g);
		}

}
