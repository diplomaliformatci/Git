package Ders31;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
		frameOlustur(){
			this.add(new Surface());
			this.setTitle("Ders 2. ornek");
			this.setLocationRelativeTo(null);
			this.setSize(500,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

}
