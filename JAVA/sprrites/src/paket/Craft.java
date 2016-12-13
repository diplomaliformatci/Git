package paket;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Craft {

    private int dx;
    public double angle = 0;
    private int dy;
    public int x=0;
    public int y=0;
    public Image image;
    public int scale = 0;
    List<Missle> missle = new ArrayList<Missle>();
    List<Missle> misslePushed = new ArrayList<Missle>();
    public Craft() {
        
        initCraft();
    }
    
    public Image initCraft() {
        
        ImageIcon ii = new ImageIcon("/Users/cankincal/Desktop/OKUL/CollisionEx/CollisionEx/craft.png");
        image = ii.getImage();
        System.out.println(image.getHeight(null) +"   "+image.getWidth(null));
        x = 50;
        y = 50;        
        return image;
    }
    public void paint(Graphics2D g2d){
    		for (Missle missle : misslePushed){
    		 missle.doDrawing(g2d);
    		}
    }
    
    public void addMissle(){
    	missle.add(new Missle(30));
    }
    public void releaseMissle(){
    	if (!missle.isEmpty()){
    		missle.get(0).y = this.y;
    		missle.get(0).x = this.x;
    	misslePushed.add(missle.get(0));
    	missle.remove(0);
    	}
    }
    
    public void move() {
        x += dx;
        y += dy;
    }
    public void missleMove(){
    	for (Missle missle : misslePushed){
    		missle.MissleMove();
    	}
    }
  
    public void setX(int x){
    	this.x = x;
    }
    public void setY(int y){
    	this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Image getImage() {
        return image;
    }
    public double getScale(){
    	return Math.tan(scale*Math.PI/180)/10;
    	
    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE){
        	releaseMissle();
        }
        if (key == KeyEvent.VK_LEFT) {
        	dx = -5;
        move();
        }
        if (key == KeyEvent.VK_RIGHT) {
        	dx = 5;
        move();
        }
        if (key == KeyEvent.VK_UP) {
           dy = -5;
        	move();
        }

        if (key == KeyEvent.VK_DOWN) {
        	dy = +5;
        	move();
        }
    }

    public void keyReleased(KeyEvent e) {
      	int key = e.getKeyCode();
      
        if (key == KeyEvent.VK_LEFT) {
        	
        }

        if (key == KeyEvent.VK_RIGHT) {
        
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
            dx = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
            dx = 0;
        }
    }
}