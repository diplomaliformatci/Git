package Atis2;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
			public frameOlustur(){
				initUI();
			}
			private void initUI(){
				this.setSize(1000,500);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				this.add(new Surface());
				this.setTitle("Deneme 2");
			}
}
