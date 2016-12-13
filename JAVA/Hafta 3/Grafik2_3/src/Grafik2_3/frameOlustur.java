package Grafik2_3;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
				public frameOlustur(){
					initUI();
				}
			private void initUI(){
				this.add(new Surface());
				this.setTitle("Dama Tahtasi");
				this.setSize(1000, 1000);
				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
}
