package Pattern;

public class Otomobile extends moveAble implements Visitable{

	public Otomobile(int Size, int TaxValue) {
		super(Size, TaxValue);
	}

	@Override
	public int accept(SpeedLimitVisitor visit) {
		return visit.visit(this);
	}

}
