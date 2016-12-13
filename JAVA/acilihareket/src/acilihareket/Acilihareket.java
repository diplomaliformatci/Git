/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acilihareket;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.lang.Math;


class Surface extends JPanel implements ActionListener {

    private final int DELAY = 100;
    private Timer timer;
    int pos_x=0;
    int pos_y=0;
    int aci=15;
        
        double radyan=deg2rad(aci);
        double hiz=10;
        double xvel=Math.cos(radyan)*hiz;
        double yvel=Math.sin(radyan)*hiz;

    public Surface() {
        initTimer();
    }
      
 private void initTimer() {

        timer = new Timer(DELAY, this);
        timer.start();
    }  
    private void doDrawing(Graphics g) {
       
    Graphics2D g2d = (Graphics2D) g.create();
    
            //BufferedImage buffImg = new BufferedImage(600, 600,
                   // BufferedImage.TYPE_INT_ARGB);
            //Graphics2D gbi = buffImg.createGraphics();
            g2d.setPaint(Color.blue);
            g2d.fillRect(pos_x, pos_y, 40, 40);
   
            g2d.setPaint(Color.green);
            g2d.fillRect(pos_x+5, pos_y+5, 30, 30);

            //g2d.drawImage(buffImg, 1, 1, null);
           // gbi.dispose();
               
        g2d.dispose();
    }

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }  
    private void hareket() {

        pos_x+=xvel;
        pos_y+=yvel;     
    }
    private double deg2rad(double derece)
    {
        return derece*(Math.PI/180);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { 
        hareket();
        repaint();
    }

}

public class Acilihareket extends JFrame {
    
    public Acilihareket() {
        
        initUI();
    }
    
    private void initUI() {
        
        setTitle("Clipping");

        add(new Surface());
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                Acilihareket cl = new Acilihareket();
                cl.setVisible(true);
            }
        });        
    }
}