package Sinav1;

import java.awt.Component;

import javax.swing.JFrame;

public class Board extends JFrame{
	public Board(){
		initUI();
	}
	private void initUI(){
		this.setSize(1000,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(new Ball());
		this.setTitle("Deneme 2");
	}
}
