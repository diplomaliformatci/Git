package Pattern;

public class GeneralProfileABD implements SpeedLimitVisitor{
	String Name = "GeneralProfile ABD";
	public GeneralProfileABD(){
		
	}
	@Override
	public int visit(Truck truck) {
		System.out.println("Rules For that Otomobile:" +Name+((truck.getSize() > 50) ? "WagonTruck" : "SpeedTruck"));
		return 0;
	}

	@Override
	public int visit(Otomobile otomobile) {
		System.out.println("Rules For that Otomobile:" + Name+((otomobile.getSize() > 50) ? "Jeep" : "Minivan"));
		return 0;
	}

	@Override
	public int visit(Cart cart) {
		System.out.println("Rules For that Cart:" + Name +((cart.getSize() > 50) ? "RaceHorse" : "Ponny"));
		return 0;
	}

}
