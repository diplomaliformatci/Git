package Areas;
import javax.swing.JFrame;

public class AreasEx extends JFrame{
	public AreasEx (){
		initUI();
	}
	public void initUI(){
		Surface deneme = new Surface();
		add(deneme);
		this.setTitle("Areas");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}