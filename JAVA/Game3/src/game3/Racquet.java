
package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
public class Racquet {

    
    Ball3 ball3 = new Ball3(this.game);
    
    private static final int Y = 900;
    private static int WIDTH = 250;
    private static final int HEIGHT = 25;
    int x = 960;
    int xa = 0;
    private Game3 game;
    
    public Racquet(Game3 game) {
        
        this.game = game;
    }

    public void move() {
        if (x + xa > 0 && x + xa < game.getWidth() - WIDTH) {
            x = x + xa;
        }
    }
    public void score(){
        
    }

    public void paint(Graphics2D g) {
        g.setPaint(Color.MAGENTA);
        g.fillRect(x, Y, WIDTH, HEIGHT);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -3;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 3;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, Y, WIDTH, HEIGHT);
    }

    public int getTopY() {
        return Y;
    }
}
