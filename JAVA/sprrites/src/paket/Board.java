package paket;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Board extends JPanel implements ActionListener {
	AffineTransform old;
    private Timer timer;
    private Craft craft;
    private final int DELAY = 10;
    Graphics2D g2d;
    private int count = 0;
    
    public Board() {

        initBoard();
    }
    
    private void initBoard() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        craft = new Craft();

        timer = new Timer(DELAY, this);
        timer.start();        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
        repaint();
        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
      //  System.out.println(a+"   "+ b);
      //  AffineTransform old = g2d.getTransform();
        //g2d.rotate(craft.getScale() ,craft.getX()+70 ,craft.getY()+70);
       // g2d.translate(craft.getX(),craft.getY());
        g2d.drawImage(craft.getImage(), craft.getX(),craft.getY(), this);    
        g2d.setPaint(Color.WHITE);
        g2d.drawString("Missle", 50, 50);
        craft.paint(g2d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if (count == 100){
        	craft.addMissle();
        	count = 0;
        }
        craft.move();
        craft.missleMove();
        repaint();  
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        //    g2d.setTransform(old);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
    }
}