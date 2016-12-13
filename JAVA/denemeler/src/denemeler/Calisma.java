package denemeler;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.ActiveEvent;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;;
public class Calisma extends JFrame implements ActionListener{
		public Calisma () {
			final double karekenari = 600;
			int aci;
			Random rand = new Random();
			aci = rand.nextInt(90)+1;
//aci = 2;
			double karekenarix = 600; 
		    double karekenariy = 600;
			this.setSize(650,650);
			this.setResizable(false);
			this.setTitle("Donen Top");
			JPanel kare = new JPanel();
			kare.setSize(15,15);
			kare.setLayout(null);
			kare.setVisible(true);
			this.setVisible(true);
			kare.setLocation(10,10);
			this.add(kare);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			kare.setBackground(Color.BLACK);
			double ilk = Math.sin(aci*Math.PI/180);
			ilk *= karekenari;
			karekenariy = ilk;
		      double lokasyonx=15 ,lokasyony=15;
			while (true){
				aci = Math.abs((90 - aci)/2);
				// Y < 20
				if (kare.getY() >= 570 && kare.getX() <= 35 ){
					while (true){
						if (kare.getY() >= 600 || kare.getX() >= 600)
							break;
						kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx += 0.0000001;
					lokasyony -= 0.0000001;
					}
				}
				else	if (kare.getY() >= 35 && kare.getX() <= 35 ){
					while (true){
						if (kare.getY() >= 600 || kare.getX() >= 600)
							break;
						kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx += 0.0000001;
					lokasyony += 0.0000001;
					}
				}
				else if (kare.getY() <= 20){
		      while(true){
				if (aci < 45){
				if (kare.getY() >= 600 || kare.getX() >= 600)
					break;
				kare.setLocation((int)lokasyonx, (int)lokasyony);
				lokasyonx += 0.0000001 * aci;
				lokasyony += 0.0000001 * (90-aci);
			//	System.out.println(kare.getLocation() + "\n" + aci);
			}
			
			else {
				if (kare.getY() <= 0 || kare.getX() <= 0)
					break;
				kare.setLocation((int)lokasyonx, (int)lokasyony);
				lokasyonx -= 0.0000001 * aci;
				lokasyony -= 0.0000001 * (90-aci);
			//	System.out.println(kare.getLocation() + "\n" + aci);
				
			} // if else li else
				
		} // çoklu ifin içindeki while
				} // çoklu ifin biirincisi
		 // X > 20 100
				else if (kare.getX() >= 0 && kare.getX() <= 100){
					if (aci < 45){
						while (true){
					if (kare.getY() <= 0 || kare.getX() >= 600)
						break;
					kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx += 0.0000001 * aci;
					lokasyony -= 0.0000001 * (90-aci);
					//System.out.println(kare.getLocation() + "\n" + aci);
				}
					}
				
				else {
					while (true){
					if (kare.getY() >= 600 || kare.getX() >= 600)
						break;
					kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx += 0.0000001 * (90-aci);
					lokasyony -= 0.0000001 * aci;
				//	System.out.println(kare.getLocation() + "\n" + aci);
					
				} // if else li else
				} // çoklu ifin içindeki while
							} // çoklu ifin biirincisi
					
					
			
				// else if karex <20
				
				else if (kare.getX() >=580){
					if (aci < 45){
						while (true){
					if (kare.getY() <= 0 || kare.getX() >= 610)
						break;
					kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx -= 0.0000001 * (90-aci);
					lokasyony += 0.0000001 * aci;
				//	System.out.println(kare.getLocation() + "\n" + aci);
				}
					}
				
				else {
					while (true){
					if (kare.getY() <= 0 || kare.getX() >= 610)
						break;
					kare.setLocation((int)lokasyonx, (int)lokasyony);
					lokasyonx -= 0.0000001 * aci;
					lokasyony += 0.0000001 * (90-aci);
				//	System.out.println(kare.getLocation() + "\n" + aci);
					
				} // if else li else
				} // çoklu ifin içindeki while
							} // çoklu ifin biirincisi
					
				 // else if karex < 582
				
				
				
				else if (kare.getY() >=580 || kare.getY() > 500){
					
							if (aci < 45){
								while (true){
							if (kare.getY() <= 0 || kare.getX() >= 600)
								break;
							kare.setLocation((int)lokasyonx, (int)lokasyony);
							lokasyonx += 0.0000001 * (90-aci);
							lokasyony -= 0.0000001 * aci;
							//System.out.println(kare.getLocation() + "\n" + aci);
						}
							}
						
						else {
							while (true){
							if (kare.getY() <= 0 || kare.getX() >= 600)
								break;
							kare.setLocation((int)lokasyonx, (int)lokasyony);
							lokasyonx += 0.0000001 * aci;
							lokasyony -= 0.0000001 * (90-aci);
							//System.out.println(kare.getLocation() + "\n" + aci);
							
						} // if else li else
						}	
					 // çoklu ifin içindeki while
							} // çoklu ifin biirincisi
				 // else if kare < 580 y
			
			
			
			
			
			} // Genel While
		}// Calisma Parantez
	private void yenilocate (int aci , int karekenarix ,int karekenariy) {
		 	
	} // yenilocate Parantez
	
	
	
	// random aci - 90 = y nin kat sayisis aci ise x in kat sayisi
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
			




}
