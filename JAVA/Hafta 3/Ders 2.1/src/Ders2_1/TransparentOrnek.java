package Ders2_1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TransparentOrnek extends JFrame{
		public TransparentOrnek () {
			this.setSize(500,600);
		// set the layout for the JFrame
			this.setLayout(new BorderLayout());
			//construct the graph panels
			 JPanel regularPanel = new JPanel();
			 Container con = new Container();
				//configure the layout
				con.setLayout(new GridBagLayout());
				// add panels to the container
			 for (int i = 0 ; i < 20 ; i++){
				 GraphPanel gp = new GraphPanel("Graphpanel1" , 100 ,100 , this.getSize());
			 con.add(gp);
			// new container
			 }
			//Container con = new Container();
			//configure the layout
			//con.setLayout(new GridBagLayout());
			// add panels to the container
			//con.add(g1);
			//con.add(g2);
			//con.add(g3);
			// add container to the JFrame positioned in the center 
			this.add("Center",con);
			
		}
}