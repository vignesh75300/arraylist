package com.vignesh.bill;

public class UnitPrice {



	public String type;
	public int minUnit;
	public int maxUnit;
	public double price;
	
	
	
	// Used for initializing values
	public UnitPrice( String type, int minUnit, int maxUnit, double price) {
		this.type = type;
		this.minUnit = minUnit;
		this.maxUnit = maxUnit;
		this.price = price;
		
		
	}

	@Override
	public String toString() {
		return "UnitPrice [type=" + type + ", minUnit=" + minUnit + ", maxUnit=" + maxUnit + ", price=" + price + "]";
	}

	
	
	
}
