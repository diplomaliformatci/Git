package Pattern;

public class WinterCalculator implements BodyFaktorVisitor{

	@Override
	public double visit(Male man) {
		return (66.47+ (13.75 * man.getWeight()) + (5.0 * man.getHeight()) - (6.75 * man.getAge()))*2.4;
	}

	@Override
	public double visit(Female women) {
		return (665.09 + (9.56 * women.getWeight()) + (1.84 * women.height) - (4.67 * women.age)) * 2.0;
	}

}
