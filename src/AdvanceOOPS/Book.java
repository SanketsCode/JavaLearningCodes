package AdvanceOOPS;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("id - [%d] name - [%s] reviews - [%s]",id,name,reviews);
	}
	
	
}
