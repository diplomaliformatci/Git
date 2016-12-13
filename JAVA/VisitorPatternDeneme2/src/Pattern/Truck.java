package Pattern;

public class Truck extends moveAble implements Visitable{

	public Truck(int Size, int TaxValue) {
		super(Size, TaxValue);
	}

	@Override
	public int accept(SpeedLimitVisitor visit) {
		return visit.visit(this);
	}

}
