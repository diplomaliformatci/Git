package Game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Atis {
	public int x;
	public int y;
	Graphics2D g2d;
	private int increment;
	private boolean border;
	public Atis(int x , int y){
		Random rand = new Random();
		increment = rand.nextInt(10)+1;
		this.x = x;
		this.y = y;
		}
	public void paint(Graphics2D g2d){
		g2d.setPaint(Color.blue);
		g2d.fillOval(x, y, 30, 30);
		g2d.setPaint(Color.YELLOW);
		g2d.fillOval(x+10, y+10, 15, 15);
	}
	public void move (){
			//paint(g2d);
		if (y > 450){
		 border = true;
	 }
		if (y < 0){
			border = false;
		}
	 if (border){
		 y -= increment;
	 }
	 else {
		 y += increment;
	 }
	
}
}
