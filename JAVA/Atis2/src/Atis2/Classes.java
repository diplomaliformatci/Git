package Atis2;

import java.awt.EventQueue;

public class Classes {
				public static void main(String[] args){
					EventQueue.invokeLater(new Runnable(){
						@Override
						public void run(){
							frameOlustur frame = new frameOlustur();
							frame.setVisible(true);
						}
					});
				}
}
