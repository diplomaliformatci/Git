package defetta;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
				frameOlustur(){
						initUI();
					}
				private void initUI(){
					this.add(new Surface());
					this.setTitle("MyPaint");
					this.setSize(500, 500);
					this.setLocationRelativeTo(null);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
}
