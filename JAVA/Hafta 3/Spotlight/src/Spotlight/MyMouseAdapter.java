package Spotlight;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyMouseAdapter extends MouseAdapter {
	private boolean mouseln;
	private int x;
	private int y;
	public MyMouseAdapter(boolean mouseln , int x , int y){
		this.x = x;
		this.y = y;
		this.mouseln = mouseln;
		
	}
	@Override
	public void mouseExited(MouseEvent e){
		mouseln = false;
		//repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e){
		mouseln = true;
		
	}
	@Override
	public void mouseMoved(MouseEvent e){
	x= e.getX();
	y= e.getY();
	//repaint();
	}
}