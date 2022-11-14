package ExceptionHandling;

import java.util.Scanner;

public class TryWithRecourses {
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
