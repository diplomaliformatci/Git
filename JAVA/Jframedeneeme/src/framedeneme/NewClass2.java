/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framedeneme;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;


public class NewClass2 {
    public static void main (String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GUI Calisiyoruz");
    JPanel GUI = new JPanel();
    GUI.setLayout(null);
    JPanel dugmeler = new JPanel();
    dugmeler.setLayout(null);
    dugmeler.setLocation(10,10);
    dugmeler.setSize(1000,1000);
    GUI.add(dugmeler);
    JButton jbi = new JButton();
    jbi.setText("buna basma");
    jbi.setSize(120,20);
    jbi.setLocation(0,20);
    jbi.setHorizontalAlignment(0);
    jbi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           JOptionPane jop1 = new JOptionPane();
           JOptionPane.showMessageDialog(null,"tiklama demedikmi");        }
        });
  
		
    	JButton jb2 = new JButton();
    	jb2.setSize(120,20);
    	jb2.setLocation(0,40);
    	jb2.setHorizontalAlignment(0);
    	jb2.setText("buna bas");
    	dugmeler.add(jb2);

    //dugmeler.add(jb2);
    dugmeler.add(jbi);
    frame.setSize(330,330);
    frame.setContentPane(GUI);
    frame.setResizable(true);
    frame.setVisible(true);
    
    }
    
}
