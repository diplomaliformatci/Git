package Spotlight;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
				public frameOlustur(){
					initUI();
				}
				private void initUI(){
					this.add(new Surface());
					this.setTitle("Spotlight");
					this.setSize(500, 500);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					this.setLocationRelativeTo(null);
				}
}
