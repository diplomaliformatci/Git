/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafik1;

/**
 *
 * @author ceng
 */
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {
private void doDrawing(Graphics g)
{
    Graphics2D kalem=(Graphics2D) g;
    kalem.drawString("Benden Selam Olsun",50,50);
}
    
@Override
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    doDrawing(g); 
}
}

public class Grafik1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public Grafik1()
    {
        initUI();
    }
    private void initUI()
    {
        add(new Surface());
        setTitle("Grafik Programlama");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }  
    public static void main(String[] args) {
        // TODO code application logic here
   
    EventQueue.invokeLater(new Runnable() {   
    @Override
    public void run()
    {
        Grafik1 gr1=new Grafik1();
        gr1.setVisible(true);
    }
    
    } );
    }
    
}
