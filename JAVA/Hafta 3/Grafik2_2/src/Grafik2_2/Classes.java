package Grafik2_2;

import java.awt.EventQueue;

public class Classes {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				frameOlustur gr1 = new frameOlustur();
				gr1.setVisible(true);
			}
		});

	}

}
