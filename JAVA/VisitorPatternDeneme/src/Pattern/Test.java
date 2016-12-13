package Pattern;

public class Test {
	public static void main(String[] args){
		SummerCalculator Summer = new SummerCalculator();
		WinterCalculator Winter = new WinterCalculator();
		Female female = new Female(180,80,15);
		Male male = new Male(190,90,16);
	 System.out.println("Female winter BMR : " + female.accept(Winter) );
	 System.out.println("Female Summer BMR : " + female.accept(Summer));
	 System.out.println("Male Winter BMR : " + male.accept(Winter));
	 System.out.println("Male Summer BMR : " + male.accept(Summer));
	}

}
