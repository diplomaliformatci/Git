package Patter;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements Visitor{
	DecimalFormat df = new DecimalFormat("#.##");
	public TaxHolidayVisitor(){
		
	}
	public double visit(Liquor liquorItem){
		System.out.println("Liquor item price ");
		return Double.parseDouble(df.format(liquorItem.getPrice()*.2 ) +
				liquorItem.getPrice());
	}
	public double visit (Tobacco tobaccoItem){
		System.out.println("Tobacco item price:");
		return Double.parseDouble(df.format(tobaccoItem.getPrice()*.3) +
				tobaccoItem.getPrice());
	}
	public  double visit(Necessity necessityItem){
		System.out.println("Necessity item price:");
		return Double.parseDouble(df.format(necessityItem.getPrice()*.5 ) +
				necessityItem.getPrice());
}
}
