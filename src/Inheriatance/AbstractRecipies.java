package Inheriatance;



public abstract class AbstractRecipies {
	
	public void execute() {
		getReady();
		doTheDish();
		CleanUp();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void CleanUp();

}
