package Textures;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
				public frameOlustur(){
					initUI();
				}
				private void initUI(){
					this.add(new Surface());
					this.setSize(500,500);
					this.setLocationRelativeTo(null);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
}
