package Waiting_Demo;

import java.awt.EventQueue;

public class Classes {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				WaitingEx ex = new WaitingEx();
				ex.setVisible(true);
			}
		});

	}

}
