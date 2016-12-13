package Pattern;

public interface SpeedLimitVisitor {
		public int visit(Truck truck);
		public int visit(Otomobile otomobile);
		public int visit(Cart cart);

}
