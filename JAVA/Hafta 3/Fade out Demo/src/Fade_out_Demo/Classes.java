package Fade_out_Demo;

import java.awt.EventQueue;

public class Classes {
		
	public static void main (String[] args){
		EventQueue.invokeLater(new Runnable(){
				@Override 
				
				public void run(){
					FadeOutEx ex = new FadeOutEx();
					ex.setVisible(true);
				
				}
			});
		
	}
}
