
package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
public class Block5 {

    
    Ball3 ball3 = new Ball3(this.game);
    
    private static final int Y = 100;
    private static int WIDTH = 100;
    private static final int HEIGHT = 25;
    int x = 700;
    int xa = 0;
    private Game3 game;
    int sayac5=2;
    
    public Block5(Game3 game) {
        
        this.game = game;
    }

    
    

    public void paint(Graphics2D g) {
        if(sayac5 >= 0){
            if(sayac5==2){
                g.setPaint(Color.RED);
            }
            else if(sayac5==1){
                g.setPaint(Color.ORANGE);
            }
            else if(sayac5==0){
                g.setPaint(Color.YELLOW);
            }
            
            
            g.fillRect(x, Y, WIDTH, HEIGHT);
            
        }
        else{
            
        }
        
    }

    

    public Rectangle getBounds() {
        if(sayac5>=0){
            return new Rectangle(x, Y, WIDTH, HEIGHT);
        }
            
        else{
            return new Rectangle(0,0,0,0);
        }
            
        
    }

    public int getLeftX() {
        return x;
    }
    
    public int getRightX() {
        return x;
    }
    
    public int getTopY() {
        return Y;
    }
    
    public int getBotY(){
        return Y+HEIGHT;
    }
}
