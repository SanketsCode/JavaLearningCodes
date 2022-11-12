package AdvanceOOPS;

public class Review {

	private int id;
	private String descreption;
	private int rating;
	
	public Review(int id,String description,int rating){
		this.id =id;
		this.descreption = description;
		this.rating = rating;
	}
	
	public String toString() {
		return id + " " + descreption + " " + rating;
	}

}
