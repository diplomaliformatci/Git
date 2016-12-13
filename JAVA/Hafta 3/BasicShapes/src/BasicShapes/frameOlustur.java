package BasicShapes;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
		public frameOlustur(){
			initUI();
		}
		private void initUI(){
			add(new Surface());
			setTitle("Basic Shapes");
			setSize(350,250);
			setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
