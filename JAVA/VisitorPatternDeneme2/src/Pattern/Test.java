package Pattern;

public class Test {
	public static void main(String[] args){
		GeneralProfileABD abd = new GeneralProfileABD();
		GeneralProfileUK uk = new GeneralProfileUK();
		Truck truck = new Truck(40,50);
		Cart cart = new Cart(100, 100);
		Otomobile otomobile = new Otomobile(70 , 30);
		truck.accept(uk);
		truck.accept(abd);
		cart.accept(uk);
		cart.accept(abd);
		otomobile.accept(uk);
		otomobile.accept(abd);
	}
}
