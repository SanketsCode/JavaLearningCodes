package PrimitiveDatatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principle;
	private BigDecimal interest;
	
	SimpleInterestCalculator(String principle,String interest){
		this.principle =  new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}
	
	public BigDecimal calculateTotalValue(int year) {
		BigDecimal TotalValue = principle.add(principle.multiply(interest).multiply(new BigDecimal(year)));
		return TotalValue;
	}

}
