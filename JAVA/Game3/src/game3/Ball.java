
package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {

    Random r=new Random();
    private static final int DIAMETER = 35;
    int x = r.nextInt(1905);
    int y = 160;
    int xa = 2;
    int ya = 2;
    public int score=0;
    private Game3 game;
    
   
    public Ball(Game3 game) {
        this.game = game;
    }

    void move() {
        if (x + xa < 0) {
            xa = 2;
        }
        if (x + xa > game.getWidth() - DIAMETER) {
            xa = -2;
        }
        if (y + ya < 0) {
            ya = 2;
        }
        if (y + ya > game.getHeight() - DIAMETER) {
            ya = -2;
        }
        if (collision()) {
            ya = -2;
            score++;
            y = game.racquet.getTopY() - DIAMETER;
        }
        x = x + xa;
        y = y + ya;
    }

    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }

    
    public void paint(Graphics2D g) {
        
        
        g.setPaint(Color.MAGENTA);
        g.drawOval(x,y,DIAMETER,DIAMETER);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}
