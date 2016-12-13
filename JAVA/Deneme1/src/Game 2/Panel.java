package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{
			private int DELAY = 50;
			Random rand = new Random();
			Atis atis = new Atis(rand.nextInt(470)+1 , 470);
			private Timer timer;
			List <Top> toplar = new ArrayList<Top>();
			public Panel (){
				initTimer();
				listedoldur();
			}
			private void listedoldur(){
				for (int i = 0 ; i < 10 ; i++){
					toplar.add(new Top(rand.nextInt(10)+1, rand.nextInt(500)+1));
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
				for(Top top : toplar)
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
				for (Top top : toplar){
					if(Cakisma(top ,atis))
					{	toplar.remove(top);
					break;
					}
					top.move();
					
						
				}
			}
		
}
