package ObjectOrientedProgramming;

public class Book {
  private int numberOfCopies; //member variable
  
  Book(int numberOfCopies){
	  this.numberOfCopies = numberOfCopies;
  }
  
  
  public void setNumberOfCopies(int copies) {
	  this.numberOfCopies = copies;
  }
  
  public void increaseCopies(int howMany) {
	  if(howMany > 0) {
		  this.numberOfCopies += howMany;
	  }
  }
  
  public void decreaseCopies(int howMany) {
	  if(this.numberOfCopies - howMany < 0) {
		  this.numberOfCopies -= howMany;
	  }
  }
}
