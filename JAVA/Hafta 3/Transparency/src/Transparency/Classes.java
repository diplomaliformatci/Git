package Transparency;

import java.awt.EventQueue;

public class Classes {
	public static void main ( String[] args){	
	EventQueue.invokeLater(new Runnable(){
						@Override
						public void run (){
						TransparentRectanglesEx ex = new TransparentRectanglesEx();
						ex.setVisible(true);
						}
		});
}
}
