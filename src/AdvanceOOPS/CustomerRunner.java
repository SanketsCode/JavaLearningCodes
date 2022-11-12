package AdvanceOOPS;

public class CustomerRunner {

	public static void main(String[] args) {
		// Object Composition
		
		//Address objects
		Address homeAddress = new Address("At post shivthar","satara","415011");
		
		Address workAddress = new Address("At Pune","pune","411044");
		
		Customer customer = new Customer("Sanket",homeAddress);
		
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		

	}

}
