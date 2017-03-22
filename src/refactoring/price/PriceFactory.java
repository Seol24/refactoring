package refactoring.price;

import refactoring.dto.Movie;

public class PriceFactory {
	public static Price getPrice(int priceCode){
		Price price = null;
		switch(priceCode){
		case Price.CHILDRENS:
			price = new ChildernPrice();
			break;
		case Price.REGULAR:
			price = new REGULARPrice();
			break;
		case Price.NEW_RELEASE:
			price = new NEW_RELEASEPrice();
			break;
		case Price.ADULT:
			price = new AdultPice();
		
		}
		return price;
	}
}
