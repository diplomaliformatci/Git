
package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball6 {

    Random r=new Random();
    private static final int DIAMETER = 50;
    int x = r.nextInt(1905);
    int y = 0;
    int xa = 3;
    int ya = 3;
    public int score=0;
    private Game3 game;
    

    public Ball6(Game3 game) {
        this.game = game;
    }

    void move() {
        
        if (x + xa < 0) {
            xa = 3;
        }
        if (x + xa > game.getWidth() - DIAMETER) {
            xa = -3;
        }
        if (y + ya < 0) {
            ya = 3;
        }
        if (y + ya > game.getHeight() - DIAMETER) {
            ya = -3;
        }
        if (collision()) {
            ya = -3;
            score++;
            game.gameOver();
            
        }
        x = x + xa;
        y = y + ya;
    }

    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g) {
        g.setPaint(Color.BLACK);
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}
