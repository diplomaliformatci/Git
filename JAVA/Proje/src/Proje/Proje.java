package Proje;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public interface Proje {
	public static void main (String args[]){
		 int x,y;
		JFrame frame = new JFrame("Deneme");
		JButton button = new JButton("Tiklama Butonu");
		frame.setSize(250, 250);
		button.setSize(10,10);
		//button.setAction(null);
		frame.add(button);
		
button.addKeyListener(new KeyListener(){

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {
		button.move(1, 1);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});
button.addKeyListener(new KeyListener(){

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {
		button.move(1, 1);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});
button.addKeyListener(new KeyListener(){

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {
		button.move(1, 1);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});
button.addKeyListener(new KeyListener(){

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {
		button.move(1, 1);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
});
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
}

	
}
