package Pattern;

public interface BodyFaktorVisitor {
	public double visit(Male man);
	public double visit(Female women);
}
