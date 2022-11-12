package PrimitiveDatatypes;

import java.math.BigDecimal;

public class InterestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500", "7.5");
		BigDecimal TotalValue = calculator.calculateTotalValue(5);
		System.out.println(TotalValue);
	}

}
