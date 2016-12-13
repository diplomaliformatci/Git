package paket;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Missle {
	public int MissleDmg;
	Image img;
	int x;
	int y;
	Craft craft;
	Board board;
	public Missle(int MissleDmg){
		if (MissleDmg > 30){
			makeBig(MissleDmg);
		}
		else {
			makeSmall(MissleDmg);
		}
		}
	private void makeBig(int MissleDmg){
		this.MissleDmg = MissleDmg;
		 ImageIcon ii = new ImageIcon("/Users/cankincal/Desktop/OKUL/CollisionEx/CollisionEx/craft.png");
	     this.img = ii.getImage();
	}
	private void makeSmall(int MissleDmg){
		this.MissleDmg = MissleDmg;
		ImageIcon ii = new ImageIcon("/Users/cankincal/Desktop/OKUL/CollisionEx/CollisionEx/craft.png");
	     this.img = ii.getImage();
		}
	public void MissleMove(){
		move();
	}
	private void move(){
	   x += 5;
	}
	private Image getImage(){
		return this.img;
	}
	private int getX(){
		return this.x;
	}
	private int getY(){
		return this.y;
	}
	public void doDrawing(Graphics2D g2d){
		g2d.drawImage(getImage(),getX(),getY(),null);
	}
	
}
