package Transparency;

import javax.swing.JFrame;

public class TransparentRectanglesEx extends JFrame{
			public TransparentRectanglesEx(){
				initUI();
			}
			private void initUI(){
				add(new Surface());
				setTitle("Transparent rectangles");
				setSize(590,120);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
}
