package Gam;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.EventQueue;
import javax.swing.JFrame;

 class Panel extends JPanel implements ActionListener{
			private int DELAY = 50;
			Random rand = new Random();
			Atis atis = new Atis(rand.nextInt(470)+1 , 470);
			private Timer timer;
			List <Classes> toplar = new ArrayList<Classes>();
			public Panel (){
				initTimer();
				listedoldur();
			}
			private void listedoldur(){
				for (int i = 0 ; i < 10 ; i++){
					toplar.add(new Classes(rand.nextInt(10)+1, rand.nextInt(500)+1));
				}
			}
			
			public void initTimer(){
			Timer timer = new Timer(DELAY,this);
				timer.start();
			}
			@Override
			public void paint(Graphics g){
				super.paint(g);

				Graphics2D g2d = (Graphics2D) g.create();
				for(Classes top : toplar)
				top.paint(g2d);
				atis.paint(g2d);
				repaint();
				g.dispose();
			g2d.dispose();
			}
			private boolean Cakisma(Top top , Atis atis){
				if (top.x < atis.x+30 && top.x > atis.x-30)
					if (top.y < atis.y+30 && top.y > atis.y-30)
					return true;
					
						return false;
				
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				atis.move();
				for (Classes top : toplar){
					if(Cakisma(top ,atis))
					{	toplar.remove(top);
					break;
					}
					top.move();
					
						
				}
			}
		
}












 class Classes {
	public int x;
	public int y;
	Graphics2D g2d;
	private int increment;
	private boolean border;
	public Classes(int x , int y){
		Random rand = new Random();
		increment = rand.nextInt(10)+1;
		this.x = x;
		this.y = y;
		}
	public void paint(Graphics2D g2d){
		g2d.setPaint(Color.blue);
		g2d.fillOval(x, y, 30, 30);
		g2d.setPaint(Color.YELLOW);
		g2d.fillOval(x+10, y+10, 15, 15);
	}
	public void move (){
			//paint(g2d);
		if (x > 450){
		 border = true;
	 }
		if (x < 50){
			border = false;
		}
	 if (border){
		 x -= increment;
	 }
	 else {
		 x += increment;
	 }
	
}
}






 class Frame extends JFrame{
		public Frame(){
			initUI();
		}
		private void initUI(){
			this.add(new Panel());
			this.setTitle("Toplar");
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}






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














