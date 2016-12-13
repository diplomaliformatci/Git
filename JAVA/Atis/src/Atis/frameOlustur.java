package Atis;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
	public frameOlustur (){
		initUI();
	}
	private void initUI(){
		this.add(new Surface());
		this.setSize(1000, 500);
		this.setTitle("Atis");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
