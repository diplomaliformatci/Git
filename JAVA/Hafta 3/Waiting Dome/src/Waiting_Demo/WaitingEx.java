package Waiting_Demo;

import javax.swing.JFrame;

public class WaitingEx extends JFrame{
	public WaitingEx(){
		initUI();
		
	}
	private void initUI(){
		add(new Surface());
		this.setTitle("Waiting");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
