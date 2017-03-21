package refactoring.statement;

import java.util.List;

import refactoring.dto.Customer;
import refactoring.dto.Rental;

public abstract class Statement {
	public String value(Customer customer) {
		// 대여료와 적립포인트 출력
		StringBuilder sb = new StringBuilder();
		//해더 출력
		sb.append(headerString(customer.getName()));
		
		//본문 출력
		List<Rental> rentals = customer.getRentals();
		for (Rental each : rentals) {
			sb.append(eachRentalString(each));
			
		} // for loop
		
		//푸터 출력
		sb.append(footerString(customer));
		return sb.toString();
	}
	protected abstract String footerString(Customer customer);
	protected abstract String eachRentalString(Rental each);

	protected abstract String headerString(String customerName);
}
