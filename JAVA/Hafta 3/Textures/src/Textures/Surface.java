package Textures;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Surface extends JPanel{
    private BufferedImage slate;
    private BufferedImage java;
    private BufferedImage pane;
    private TexturePaint slatetp;
    private TexturePaint javatp;
    private TexturePaint panetp;
	public Surface(){
            	loadImages();
            }
            public void loadImages(){
            	try{
            	slate = ImageIO.read(new File("/Users/cankincal/Downloads/Code examples/ch31/BlackjackGame/build/classes/com/deitel/blackjackclient/blackjack_images/1c.png"));
            	java = ImageIO.read(new File("/Users/cankincal/Downloads/Code examples/ch31/BlackjackGame/build/classes/com/deitel/blackjackclient/blackjack_images/1c.png"));
            	pane = ImageIO.read(new File("/Users/cankincal/Downloads/Code examples/ch31/BlackjackGame/build/classes/com/deitel/blackjackclient/blackjack_images/1c.png"));
            } catch (IOException frame) {
            	Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, frame);
            }
            }
            private void doDrawing (Graphics g){
            	Graphics2D g2d = (Graphics2D) g.create();
            	slatetp = new TexturePaint(slate,new Rectangle(0,0,50,50));
            	javatp = new TexturePaint(java,new Rectangle(0,0,90,60));
            	panetp = new TexturePaint(pane,new Rectangle(0,0,90,60));
            	g2d.setPaint(slatetp);
            	g2d.fillRect(10, 15, 90, 60);
            	g2d.setPaint(javatp);
            	g2d.fillRect(130, 15, 90, 60);
            	g2d.setPaint(panetp);
            	g2d.fillRect(250, 15, 90, 60);
            	g2d.dispose();
            }
            @Override
            public void paintComponent(Graphics g){
            	super.paintComponent(g);
            	doDrawing(g);
            }
}