/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;

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

    private final int DELAY = 10;

    double yaricap=0;
    private Timer timer;
    int pos_x=0;
    int pos_y=0;
    int aci=30;
    int aci_deg=1;
    int sayac=0;
    boolean kontrol;
    
        double hiz=10;

        double cenx,ceny;
        

    public Surface(double x,double y) {
        cenx=x;
        ceny=y;
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
        double radyan=deg2rad(aci);
	 pos_x = (int)(cenx+ yaricap * Math.cos(radyan));
	 pos_y = (int)(ceny + yaricap * Math.sin(radyan));
	aci += aci_deg;
	aci %= 360;
        if(yaricap>=300) kontrol=false;
        else if(yaricap<=10) kontrol=true;
        if(kontrol) ++yaricap;
        else --yaricap;
        
       
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

public class Circular extends JFrame {
    
    public Circular() {
        initUI();
    }
    
    private void initUI() {setSize(600, 600);
        double centerx=this.getWidth()/2;
        double centery=this.getHeight()/2;
        setTitle(centerx+"  //  "+centery);
        add(new Surface(centerx,centery));
        //add(new Surface(centerx-30,centery+20));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                Circular cl = new Circular();
                cl.setVisible(true);
            }
        });        
    }
}