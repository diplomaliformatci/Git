package framedeneme;

import javax.swing.JFrame;

public class Frameolustur extends JFrame {
	
		public static void deneme(int en,int boy,String name){
			System.out.println("islem tamam");
			JFrame frame = new JFrame(name);
			frame.setSize(en, boy);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			System.out.println("islem tamam");
		}

}
