package AdvanceOOPS;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book(1,"java");
		Review review = new Review(1,"Basic Beginner Level",4);
		
		book.addReview(review);
		
		System.out.println(book);
		

	}

}
