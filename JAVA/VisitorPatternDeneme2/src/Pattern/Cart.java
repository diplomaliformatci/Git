package Pattern;

public class Cart extends moveAble implements Visitable{

	public Cart(int Size, int TaxValue) {
		super(Size, TaxValue);
	}

	@Override
	public int accept(SpeedLimitVisitor visit) {
		return visit.visit(this);
	}

}
