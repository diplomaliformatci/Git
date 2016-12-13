package game3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game3 extends JPanel {

    Ball ball = new Ball(this);
    Ball2 ball2 = new Ball2(this);
    Ball3 ball3 = new Ball3(this);
    Ball4 ball4 = new Ball4(this);
    Ball5 ball5 = new Ball5(this);
    Ball6 ball6 = new Ball6(this);
    Racquet racquet = new Racquet(this);
    Block1 block1 = new Block1(this);
    Block2 block2 = new Block2(this);
    Block3 block3 = new Block3(this);
    Block4 block4 = new Block4(this);
    Block5 block5 = new Block5(this);
    Block6 block6 = new Block6(this);
    Block7 block7 = new Block7(this);
    Block8 block8 = new Block8(this);
    Block9 block9 = new Block9(this);
    Block10 block10 = new Block10(this);
    Block11 block11 = new Block11(this);
    Block12 block12 = new Block12(this);

    public Game3() {

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e);
            }
        });
        setFocusable(true);
    }

    private void move() {
//        ball.move();
//        ball2.move();
        ball3.move();
//        ball4.move();
//        ball5.move();
//        ball6.move();
        racquet.move();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
//        ball.paint(g2d);
//        ball2.paint(g2d);
        ball3.paint(g2d);
//        ball4.paint(g2d);
//        ball5.paint(g2d);
//        ball6.paint(g2d);
        racquet.paint(g2d);
        block1.paint(g2d);
        block2.paint(g2d);
        block3.paint(g2d);
        block4.paint(g2d);
        block5.paint(g2d);
        block6.paint(g2d);
        block7.paint(g2d);
        block8.paint(g2d);
        block9.paint(g2d);
        block10.paint(g2d);
        block11.paint(g2d);
        block12.paint(g2d);

    }

    public void gameOver() {

        JOptionPane.showMessageDialog(this, "Score: " + ball3.score, "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Mini Tennis");
        Game3 game = new Game3();
        frame.add(game);
        frame.setSize(1500, 1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(50);
        }
    }

}
