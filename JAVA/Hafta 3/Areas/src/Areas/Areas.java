package Areas;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Areas {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				AreasEx ex = new AreasEx();
				ex.setVisible(true);
			}
		});
	}

}
