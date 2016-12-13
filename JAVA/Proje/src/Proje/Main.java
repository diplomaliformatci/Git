package Proje;
/*import java.awt.MenuBar;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Main {
		private static final java.awt.MenuBar MenuBar = null;

		public static void main (String args[]){
/*	JFrame frame = new JFrame();
	frame.setTitle("Baslik");
	//for (int i=0;i<10;i++)
	JButton button = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JPanel panel = new JPanel();
	button.setSize(50,50);
	button.setText("basmalik");
	panel.setSize(150, 150);
	
	button.setLocation(50, 50);
	
	panel.add(button, 0);
	panel.add(button2, 1);
	panel.add(button3, 2);
	panel.add(button4, 3);
	panel.add(button5, 4);
	frame.setLayout(null);
	
	
	frame.add(panel);
	frame.setSize(250, 200);
	frame.setMenuBar(MenuBar);
	frame.setVisible(true);
	button.ac*/
			JFrame frame = new JFrame("Kendi Note Pad");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JTextArea notepad = new JTextArea();
			//Create the menu bar.
			 JMenuBar menuBar = new JMenuBar();

			//Build the first menu.
			JMenu menu = new JMenu("A Menu");
			menu.setMnemonic(KeyEvent.VK_A);
			menu.getAccessibleContext().setAccessibleDescription(
			        "The only menu in this program that has menu items");
			menuBar.add(menu);
			 menuBar.setVisible(true);
			frame.add(menuBar);
			notepad.setLocation(0, 50);
			notepad.setSize(300, 250);
			notepad.setVisible(true);
			frame.add(notepad);
			frame.add(menu);
			JPanel panel = new JPanel();
			JLabel label = new JLabel("Menu");
			JButton button = new JButton();
			frame.setSize(300,300);
			label.setLocation(10, 10);
			label.setSize(50,50 );
			button.setLocation(10,10);
			button.setSize(50, 50);
//			button.setVisible(true);
		panel.setVisible(false);
//			label.setVisible(true);
			button.add(label);
			panel.add(button);
			frame.add(panel);
			frame.setVisible(true);
			
			
			
			
		}

	
}*/
package SnakeDeneme;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Rectangle;
import java.util.Random;
import java.awt.Point;
import javax.swing.JFrame;


public class main {
 
	

	
	private static final Event EXIT_ON_CLOSe = null;

	public static void main (String args[]){
		Rectangle kare = new Rectangle();
		
		JFrame f = new JFrame("Snake");
		
		
		Panel p = new Panel();
		Color deneme = new Color(10,5,5);
		Color PanelColor = new Color (100,5,5);
		System.out.println(deneme);
		f.setShape(kare);
		p.setSize(50,50);
		p.setLocation(150, 150);
		System.out.println(f.getX());
		double locationx = 0.0 , locationy = 0.0;
		f.add(p);
		f.setLayout(null);
		p.setBackground(deneme);
		f.setBackground(PanelColor);
		f.setSize(500, 520);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random rand = new Random();
		int katsayix = rand.nextInt(90+1);
		int katsayiy = rand.nextInt(90+1);
		double eklex = 0.0001;
		eklex *= katsayix;
		double ekley = 0.0001;
		ekley *= katsayiy;
		while (true){
		
		while (p.getX() < 430 && p.getY() < 430){
					if (p.getX() > 420){
						eklex /= katsayix;
						katsayix = rand.nextInt(90+1);
						eklex *= katsayix;
					}
					if (p.getY() > 420){
						eklex /= katsayiy;
						katsayiy = rand.nextInt(90+1);
						eklex *= katsayiy;
					}
					locationx += eklex;
					locationy += ekley;
					p.setLocation((int)locationx,(int)locationy);
			System.out.println("birinci while");
		}
		while (p.getX() > -5 && p.getY() > -5){
			if (p.getX() < 0){
				eklex /= katsayix;
				katsayix = rand.nextInt(90+1);
				eklex *= katsayix;
			}
			if (p.getY() < 0){
				eklex /= katsayiy;
				katsayiy = rand.nextInt(90+1);
				eklex *= katsayiy;
			}
			locationx -= eklex;
			locationy -= ekley;
			System.out.println("ikinci while");
			p.setLocation((int)locationx,(int)locationy);
		
			
	}

	

}
		
		
	}
}
		
		

