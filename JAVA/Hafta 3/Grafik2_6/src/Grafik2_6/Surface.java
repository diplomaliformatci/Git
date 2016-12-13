
package Grafik2_6;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import javax.swing.Timer;

import javafx.scene.shape.MoveTo;
import sun.java2d.pipe.BufferedPaints;

public class Surface extends JPanel {
		int x=10;
		int secim;
		Random rand = new Random();
		int y=10;
		int oldx;
		int oldy;
		int cizimx=10;
		int cizimy=10;
		
		Icon kirmizi = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/kirmizi.png");
		Icon acikmavi = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/acikmavi.png");
		Icon koyumavi = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/koyumavi.png");
		Icon mor = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/mor.png");
		Icon sari = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/sari.png");
		Icon koyuyesil = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/koyuyesil.png");
		Icon pembe = new ImageIcon ("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/pembe.png");
		Icon turuncu = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/turuncu.png");
		Icon acikyesil = new ImageIcon ("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/yesil.png");
		Icon karma = new ImageIcon ("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/karma.png");
		Icon kalem = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/kalem.png");
		Icon firca = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/firca.png");
		Icon eraser = new ImageIcon("/Users/cankincal/Desktop/OKUL/Grafik Prog/Hafta 3/Grafik2_6/src/Renkler/eraser.png");
		Image image;
		Graphics2D draw;
		boolean mouseln;
		public Surface (){
			addMouseListener(new MyMouseAdapter());
			addMouseMotionListener(new MyMouseAdapter());
		}
	public void doDrawing(Graphics g){
		
			Graphics2D g2d = (Graphics2D) g.create();
		g2d.setPaint(Color.black);
			
		
		if (mouseln){
			if (secim ==1)
			draw.drawLine(x, y, oldx, oldy);	
			else if (secim ==2){
				draw.fillOval(x, y, cizimx,cizimy);
				draw.fillOval(x, y, cizimx,cizimy);
				draw.fillOval(x, y, cizimx,cizimy);
				draw.fillOval(x, y, cizimx,cizimy);
			}
			else if (secim == 3){
			//deger =	rand.nextInt()%cizimx;
				
			}
			
		}
		
			
	}
	@Override
	public void paintComponent(Graphics g){
		 if(image==null){
             image = createImage(getSize().width, getSize().height);

             draw = (Graphics2D)image.getGraphics();

             draw.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

             draw.setPaint(Color.white);
             draw.fillRect(0, 0, getSize().width, getSize().height);
             draw.setPaint(Color.black);
             repaint();
    }
		 	super.paintComponent(g);
            g.drawImage(image, 0, 0, null);
            doDrawing(g);
            repaint();
	
            JButton fillshape = new JButton(firca);
            fillshape.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		secim = 2;
            	}
            	
            });
            JButton fillmeshape = new JButton(kalem);
            fillmeshape.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		secim = 1;
            	}
            });
            JButton eraser1 = new JButton(eraser);
           eraser1.addActionListener(new ActionListener(){
        	   public void actionPerformed(ActionEvent e){
        		   draw.setPaint(Color.white);
        		   secim = 2;
        	   }
           });
	JButton redButton = new JButton(kirmizi);
	redButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			draw.setPaint(Color.red);
		}
	});
	JButton turuncubutton = new JButton(turuncu);
	turuncubutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			draw.setPaint(new Color(255,140,0));
		}
	});
	JButton pembebutton = new JButton(pembe);
	pembebutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			draw.setPaint(new Color(255,105,180));
		}
	});
	JButton blackButton = new JButton(karma);
	//blackButton.setText("Kendimi Sansli Hissediyorum");
	blackButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			draw.setPaint(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
		}
	});
	JButton magentaButton = new JButton(acikmavi);
	magentaButton.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent e){
			draw.setPaint(new Color(0,255,255,255));
		}
	});
	JButton arti = new JButton("+");
	arti.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		      cizimx += 10;
		      cizimy += 10;
		      
		}
	});
	JButton eksi = new JButton("-");
	eksi.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			cizimx -= 10;
			cizimy -= 10;
		}
	});
	
	JButton acikyesilbutton = new JButton(acikyesil);
	acikyesilbutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		draw.setPaint(new Color(0,255,154));
		}
	});
	
	JButton blueButton = new JButton(koyumavi);
	blueButton.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent e){
			draw.setPaint(new Color(0,0,255));
			
		}
	});
	JButton greenButton = new JButton(koyuyesil);
	greenButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			draw.setPaint(Color.green);
		}
		
	});
	JButton clearButton = new JButton("Clear");
	clearButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			Color eski = draw.getColor();
			draw.setPaint(Color.white);
			draw.fillRect(0, 0, getWidth(), getHeight());
		draw.setPaint(eski);
		}
	});
	fillshape.setPreferredSize(new Dimension(150,150));
	fillmeshape.setPreferredSize(new Dimension(150,150));
	blackButton.setMinimumSize(getMinimumSize());
	blackButton.setPreferredSize(new Dimension(120,120));
	magentaButton.setPreferredSize(new Dimension(100,100));
	redButton.setPreferredSize(new Dimension(100,100));
	blueButton.setPreferredSize(new Dimension(100,100));
	greenButton.setPreferredSize(new Dimension(100,100));
	acikyesilbutton.setPreferredSize(new Dimension(100,100));
	turuncubutton.setPreferredSize(new Dimension(100,100));
	pembebutton.setPreferredSize(new Dimension(100,100));
	arti.setPreferredSize(new Dimension(32,32));
	eksi.setPreferredSize(new Dimension(32,32));
	eraser1.setPreferredSize(new Dimension(100,100));
	clearButton.setLocation(30, 100);
	//this.setDefaultLocale(null);
	this.add(pembebutton);
	this.add(greenButton);
	this.add(blueButton);
	this.add(magentaButton);
	
	this.add(redButton);
	this.add(acikyesilbutton);
	this.add(turuncubutton);
	this.add(blackButton);
	this.add(arti);
	this.add(eksi);
	this.add(clearButton);
	this.add(eraser1);
	this.add(fillshape);
	this.add(fillmeshape);
		
	
	
	

//	frame.setSize(600, 600);
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	frame.setVisible(true);
	
}
	
	
	
	
	
	public class MyMouseAdapter extends MouseAdapter {
	@Override
	public void mouseReleased(MouseEvent e) {
		if (secim ==2){
		x = e.getX();
		y = e.getY();
		}
		mouseln = false;
	}

	@Override
	public void mouseMoved(MouseEvent e){
		x = e.getX();
		  y = e.getY();
	
		}
	@Override
	public void mouseClicked(MouseEvent e){
	if (secim == 2){
		oldx = e.getX();
		oldy = e.getY();
	}
	}
	@Override
	public void mouseDragged(MouseEvent e){
		mouseln = true;
	//	if (secim == 1){
		oldx = x;
		oldy = y;
	
	  x = e.getX();
	  y = e.getY();
	//	}
	}
		
		 			
	}

	}
	

