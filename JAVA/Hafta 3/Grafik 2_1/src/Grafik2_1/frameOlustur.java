package Grafik2_1;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
		public frameOlustur () {
			initUI();
		}
		private void initUI(){
			add(new Surface());
			this.setTitle("Kesik Cizgi");
			this.setSize(this.getWidth(), this.getHeight());
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
}
