package refactoring.dto;

import refactoring.price.Price;
import refactoring.price.PriceFactory;

public class Movie {


	private String title;
	private Price price;

	public Movie(String title, int priceCode) throws IllegalAccessException {
		this.title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode){
		price = PriceFactory.getPrice(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRentalPoints(int aDaysRented) {
		return price.getFrequentRentalPoints(aDaysRented);
	}

}
