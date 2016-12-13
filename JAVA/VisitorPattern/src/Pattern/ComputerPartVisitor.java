package Pattern;

public interface ComputerPartVisitor {
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
