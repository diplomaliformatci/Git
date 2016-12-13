package Pattern;

public class GeneralProfileUK implements SpeedLimitVisitor{
	
	String Name = "GeneralProfile UK";
	public GeneralProfileUK(){
		
	}
	@Override
	public int visit(Truck truck) {
		System.out.println("Rules For that Otomobile:" +Name+((truck.getSize() > 30) ? "Dump truck" : "Box truck"));
		return 0;
	}

	@Override
	public int visit(Otomobile otomobile) {
		System.out.println("Rules For that Otomobile:" + Name+((otomobile.getSize() > 50) ? "Compact 4x4" : "Bubble car"));
		return 0;
	}

	@Override
	public int visit(Cart cart) {
		System.out.println("Rules For that Cart:" + Name +((cart.getSize() > 50) ? "RaceHorse" : "Ponny"));
		return 0;
	}


}
