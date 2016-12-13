package Game;

import java.awt.EventQueue;

public class Classes {
	public static void main (String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Frame frame = new Frame();
				frame.setVisible(true);
			}
		});
	}

}
