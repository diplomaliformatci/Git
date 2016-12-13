package Gam;

import javax.swing.JFrame;

public class Frame extends JFrame{
		public Frame(){
			initUI();
		}
		private void initUI(){
			this.add(new Panel());
			this.setTitle("Toplar");
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
