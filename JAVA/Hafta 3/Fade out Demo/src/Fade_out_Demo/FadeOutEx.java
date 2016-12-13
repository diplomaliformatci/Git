package Fade_out_Demo;

import javax.swing.JFrame;

public class FadeOutEx extends JFrame{
		public FadeOutEx(){
			initUI();

		}
		private void initUI(){
			add(new Surface());
			pack();
			setTitle("Fade Out");
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
