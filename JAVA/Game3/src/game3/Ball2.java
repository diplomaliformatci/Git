
package game3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball2 {

    Random r=new Random();
    private static final int DIAMETER = 70;
    int x = r.nextInt(1905);
    int y = 120;
    int xa = 1;
    int ya = 1;
    public int score=0;
    private Game3 game;
    

    public Ball2(Game3 game) {
        this.game = game;
    }

    void move() {
        if (x + xa < 0) {
            xa = 1;
        }
        if (x + xa > game.getWidth() - DIAMETER) {
            xa = -1;
        }
        if (y + ya < 0) {
            ya = 1;
        }
        if (y + ya > game.getHeight() - DIAMETER) {
            ya = -1;
        }
        if (collision()) {
            ya = -1;
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
        g.setPaint(Color.GREEN);
        g.fillRect(x, y, DIAMETER, DIAMETER);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}
