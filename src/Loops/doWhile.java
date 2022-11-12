package Loops;

import java.util.Scanner;

public class doWhile {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	do {
		System.out.println("Enter Your Number ");
		num = sc.nextInt();
		if(num < 0) {
			System.out.println("Thank You!");
			break;
		}
		System.out.println("Cube is "+(num*num*num));
	}while(num > 0);
	
	sc.close();
}
}
