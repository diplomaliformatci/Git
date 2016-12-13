package SimplePaint;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class frameOlustur extends JFrame{
	private boolean mouseln;   
	   private Container con = new Container();
	public frameOlustur(){
		   initGUI();
		
	   }
	   private void initGUI(){
		   this.add(new Surface());
		   Surface renklik = new Surface();
		   renklik.setLocation(0, 0);
		   renklik.setSize(new Dimension(150,500));
		   renklik.setBackground(Color.black);
		   this.add(renklik);
		   this.setTitle("Simple Paint");
		   this.setSize(500, 500);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   this.setLocationRelativeTo(null);
	   }
	   
	  

}
