package Inheriatance;

public class Recipe1 extends AbstractRecipies {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Do the dish");
		
	}

	@Override
	void CleanUp() {
		// TODO Auto-generated method stub
		System.out.println("Clean Up the mess");
		
	}

}
