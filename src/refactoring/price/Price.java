package refactoring.price;

import refactoring.dto.Movie;

public abstract class Price {
	
	public static final int REGULAR = 1;
	public static final int NEW_RELEASE = 2;
	public static final int CHILDRENS = 3;
	public static final int ADULT = 4;
	
	public abstract int getPriceCode();
	
	public abstract double getCharge(int daysRented);
	
	public int getFrequentRentalPoints(int aDaysRented) {
		return 1;
	}
}
