package refactoring.price;

import refactoring.dto.Movie;

public class NEW_RELEASEPrice extends Price {

	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	public double getCharge(int daysRented) {
		double result = 0;
		result = (daysRented * 3000);
		return result;
	}

	public int getFrequentRentalPoints(int aDaysRented) {
		return aDaysRented>1?2:1;
	}
}
