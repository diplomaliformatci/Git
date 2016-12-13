package Color;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
						public frameOlustur(){
							initUI();
						}
						public void initUI(){
							add(new Surface());
							this.setSize(500,500);
							this.setTitle("Colours");
							this.setLocationRelativeTo(null);
							this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						}
}
