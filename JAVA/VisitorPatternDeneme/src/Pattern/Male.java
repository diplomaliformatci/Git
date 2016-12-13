package Pattern;

public class Male extends Human implements BodyFaktor{

	public Male(int weight, int height, int age) {
		super(weight, height, age);
	}

	public double accept(BodyFaktorVisitor visitor){
	return visitor.visit(this);	
	}
}
