package refactoring.price;

import refactoring.dto.Movie;

public class REGULARPrice extends Price {

	@Override
	public int getPriceCode() {
		return  REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		// 비디오물당 대여료
		// 1. 일반물 (2일) 2000원, 일일초과 1500원, 적립1
		// 2. 아동물 (3일) 1500원, 일일초과 1500원, 적립1
		// 3. 최신물 (1일) 3000원, 일일초과 3000원, 적립1
		double result = 0;
		result = 2000;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1500;
		}
		return result;
	}

	
}
