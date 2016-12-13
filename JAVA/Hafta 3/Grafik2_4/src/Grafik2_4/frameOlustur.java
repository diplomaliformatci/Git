package Grafik2_4;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
	int boyuty = 500;
	int boyutx = boyuty*3/2;
					public frameOlustur() {
						initUI(this.boyutx ,this.boyuty);
					}
					private void initUI(int boyutx , int boyuty){
						this.add(new Surface(boyutx,boyuty));
						this.setTitle("TurkBayragi");
						this.setSize(boyutx,boyuty);
						this.setLocationRelativeTo(null);
						this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
					}
}
