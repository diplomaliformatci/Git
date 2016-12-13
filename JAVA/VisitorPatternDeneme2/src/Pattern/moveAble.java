package Pattern;

public class moveAble {
	int Size;
	int TaxValue;
	public moveAble(int Size , int TaxValue){
		setSize(Size);
		setTaxValue(TaxValue);
	}
	private void setSize(int Size){
		this.Size = Size;
	}
	private void setTaxValue(int TaxValue){
		this.TaxValue = TaxValue;
	}
	public int getSize(){
		return this.Size;
	}
	public int getTaxValue(){
	return this.TaxValue;
	}

}
