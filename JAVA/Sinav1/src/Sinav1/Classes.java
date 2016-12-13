package Sinav1;

import java.awt.EventQueue;

public class Classes {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				Board frame = new Board();
				frame.setVisible(true);
			}
		});
	}
}

