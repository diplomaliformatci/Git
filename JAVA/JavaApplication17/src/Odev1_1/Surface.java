/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev1_1;


import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.JPanel;

/**
 *
 * @author cankincal
 */
public class Surface extends JPanel implements ActionListener {
    private final int DELAY = 150;
    private Timer timer;
    public Surface () {
        initTimer();
    }
    private void initTimer(){
        timer = new Timer(DELAY,this);
        timer.start();
    }
    
}
