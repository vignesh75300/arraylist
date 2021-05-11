package com.vignesh.bill;

import java.util.ArrayList;

/**
 * EB Unit Calculation
 * Category : Home
 * 0-10 : Rs.10 per unit
 * @author vign2678
 *
 */
public class BillManager {

	static ArrayList<UnitPrice> list = new ArrayList<UnitPrice>();
	
	
	static {
		UnitPrice unitPriceHome = new UnitPrice("Home",0,100,0.0);
		UnitPrice unitPriceCom = new UnitPrice("Commercial",0,100,10.0);
		UnitPrice unitPriceAgri = new UnitPrice("Agriculture",0,100,5.0);
		
        UnitPrice unitPriceHome1 = new UnitPrice("Home",101,400,20.0);
	    UnitPrice unitPriceCom1 = new UnitPrice("Commercial",101,400,40.0);
        UnitPrice unitPriceAgri1 = new UnitPrice("Agriculture",101,400,10.0);
	
		UnitPrice unitPriceHome2 = new UnitPrice("Home",401,1000,30.0);
	    UnitPrice unitPriceCom2 = new UnitPrice("Commercial",401,1000,60.0);
        UnitPrice unitPriceAgri2 = new UnitPrice( "Agriculture",401,1000,20.0);
		
        UnitPrice unitPriceHome22 = new UnitPrice("Home",1001,10000,70.0);
	    UnitPrice unitPriceCom22 = new UnitPrice("Commercial",1001,10000,100.0);
        UnitPrice unitPriceAgri3 = new UnitPrice("Agriculture",1001,10000,40.0);
        
		list.add(unitPriceHome);
		list.add(unitPriceCom);
		list.add(unitPriceAgri);
		list.add(unitPriceHome1);
		list.add(unitPriceCom1);
		list.add(unitPriceAgri1);
		list.add(unitPriceHome2);
		list.add(unitPriceCom2);
		list.add(unitPriceAgri2);
		list.add(unitPriceHome22);
		list.add(unitPriceCom22);
		list.add(unitPriceAgri3);

	}
	public static void display1()
	{  
		for (UnitPrice unitPrice : list) {
			System.out.println(unitPrice.toString() );

		}
			}

	/**
	 * This Function is Used to Calculate Per Unit Price
	 * 
	 * @param type
	 * @param units
	 * @return
	 */
	public static double getPerUnitPrice(String type,int units) {

		if(!( type !=null && (type.equalsIgnoreCase("Home") || type.equalsIgnoreCase("Commercial") || type.equalsIgnoreCase("Agriculture") ))) {
			throw new IllegalArgumentException("Invalid Type");
		}
		if (units < 0 || units > 10000) {
			throw new IllegalArgumentException("Invalid Unit");
		}
		double perUnitPrice = 0;
		for (UnitPrice unitPrice : list) {
			if (unitPrice.type.equalsIgnoreCase(type) && units >= unitPrice.minUnit && units <= unitPrice.maxUnit) {
				perUnitPrice = unitPrice.price;
				break;
			}

		}

		return perUnitPrice;

	}

}