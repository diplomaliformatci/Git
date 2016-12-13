package Grafik2_6;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class frameOlustur extends JFrame {
			public frameOlustur(){
				initUI();
			}
			private void initUI(){
				Surface surface = new Surface();
				this.add(surface);
				this.setSize(getMaximumSize());
				//this.setLayout(null);
				this.setTitle("Paint");
				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}

}
