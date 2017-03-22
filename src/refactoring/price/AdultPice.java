package refactoring.price;

public class AdultPice extends Price {

	@Override
	public int getPriceCode() {
		return ADULT;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 0;
		result = daysRented*5000;
		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return aDaysRented>1?3:2;
	}
	
}
