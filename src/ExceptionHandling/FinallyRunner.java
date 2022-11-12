package ExceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			
			int [] numbers = {12,3,4,5};
			int number = numbers[5];
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Before Scanner Close");
			scanner.close();			
		}
		
		
	}

}
