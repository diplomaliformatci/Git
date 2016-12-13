package Pattern;

public class Female extends Human implements BodyFaktor{
	
	public Female(int weight, int height, int age) {
		super(weight, height, age);
	}

	public double accept(BodyFaktorVisitor visitor) {
		return visitor.visit(this);
	}

}
