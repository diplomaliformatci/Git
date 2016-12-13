package defeta;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class paint {
		public static void main (String[] args){
			Icon iconB = new ImageIcon("");
			Icon iconM = new ImageIcon("");
			Icon iconR = new ImageIcon("");
			Icon iconBl = new ImageIcon("");
			Icon iconG = new ImageIcon("");
			JFrame frame = new JFrame("Paint it");
			Container content = frame.getContentPane();
			//content.setLayout(new BorderLayout());
			final PadDraw drawPad = new PadDraw();
			content.add(drawPad, BorderLayout.CENTER);
			JPanel panel = new JPanel();
			panel.setPreferredSize(new Dimension(32,68));
			panel.setMinimumSize(new Dimension(32,68));
			panel.setMaximumSize(new Dimension(32,68));
			JButton clearButton = new JButton("Clear");
			clearButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					drawPad.clear();
				}
			});
			JButton redButton = new JButton(iconR);
			redButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					drawPad.red();
				}
			});
			//JButton blackButton = new JButton(iconBl);
			//blackButton.addActionListener(new ActionListener(){
			//	public void actonPerformed(ActionEvent e){
		//			drawPad.black();
		//		}

		//	});
			JButton magentaButton = new JButton(iconM);
			magentaButton.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e){
					drawPad.magenta();
				}
			});
			JButton blueButton = new JButton(iconB);
			blueButton.addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e){
					drawPad.blue();
					
				}
			});
			JButton greenButton = new JButton(iconG);
			greenButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					drawPad.green();
				}
				
			});
			//blackButton.setPreferredSize(new Dimension(16,16));
			magentaButton.setPreferredSize(new Dimension(16,16));
			redButton.setPreferredSize(new Dimension(16,16));
			blueButton.setPreferredSize(new Dimension(16,16));
			greenButton.setPreferredSize(new Dimension(16,16));
			panel.add(greenButton);
			panel.add(blueButton);
			panel.add(magentaButton);
			//panel.add(blackButton);
			panel.add(redButton);
			panel.add(clearButton);
			content.add(panel, BorderLayout.WEST);
			frame.setSize(600, 600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		}
}


class PadDraw extends JComponent {
	Image image;
	Graphics2D graphics2D;
	int currentX, currentY, oldx,oldy;
	public PadDraw (){
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				oldx = e.getX();
				oldy = e.getY();
			}
		});
		addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e){
				currentX = e.getX();
				currentY = e.getY();
				if (graphics2D != null)
					graphics2D.drawLine(oldx, oldy, currentX, currentY);
				repaint();
				oldx = currentX;
				oldy = currentY;
				
			}
		});
		
	}
	public void paintComponent(Graphics g){
		if (image== null){
			image = createImage(getSize().width,getSize().height);
		graphics2D = (Graphics2D)image.getGraphics();
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		clear();
	}
	g.drawImage(image,0,0,null);
	}
	public void clear(){
		graphics2D.setPaint(Color.white);
		graphics2D.fillRect(0, 0, getSize().width, getSize().height);
		graphics2D.setPaint(Color.black);
		repaint();
	}
	public void red(){
		graphics2D.setPaint(Color.red);
		repaint();
	
	}
	public void black(){
		graphics2D.setPaint(Color.black);
		repaint();
		}
	public void magenta(){
		graphics2D.setPaint(Color.magenta);
		repaint();
	}
	public void blue(){
		graphics2D.setPaint(Color.blue);
		repaint();
	}
	public void green(){
		graphics2D.setPaint(Color.green);
		repaint();
	}
	
	
	
}


