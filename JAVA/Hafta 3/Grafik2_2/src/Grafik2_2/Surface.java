package Grafik2_2;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Surface extends JPanel{
	private int uzunluk=50;
	private int baslangicnoktasi=300;
	private int taban;
				private void doDrawing (Graphics g){
					Graphics2D kalem = (Graphics2D)g;
					kalem.drawLine(baslangicnoktasi,baslangicnoktasi, baslangicnoktasi+uzunluk,baslangicnoktasi);
					kalem.drawLine(baslangicnoktasi+uzunluk,baslangicnoktasi,baslangicnoktasi+uzunluk,baslangicnoktasi+uzunluk);
					kalem.drawLine(baslangicnoktasi+uzunluk,baslangicnoktasi+uzunluk,baslangicnoktasi,baslangicnoktasi+uzunluk);
					kalem.drawLine(baslangicnoktasi, baslangicnoktasi+uzunluk,baslangicnoktasi,baslangicnoktasi);
					
				}
				private void doDrawing2 (Graphics g){
					Graphics2D kalem = (Graphics2D)g;
					kalem.drawLine(baslangicnoktasi,baslangicnoktasi,baslangicnoktasi-uzunluk/2 ,(int)(baslangicnoktasi+uzunluk*2/Math.pow(3, 1/3)));
					kalem.drawLine(baslangicnoktasi-uzunluk/2, (int)(baslangicnoktasi+uzunluk*2/Math.pow(3, 1/3)), +baslangicnoktasi/2, (int)(baslangicnoktasi*Math.pow(3, 1/3)));
					kalem.drawLine(+baslangicnoktasi/2, (int)(baslangicnoktasi*Math.pow(3, 1/3)), baslangicnoktasi, baslangicnoktasi);
				}
				@Override 
				public void paintComponent(Graphics g){
					super.paintComponent(g);
					doDrawing(g);
					doDrawing2(g);
				}
}
