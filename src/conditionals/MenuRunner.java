package conditionals;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your 1st Number ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter Your 2nd Number ");
		int number2 = sc.nextInt();
		
		System.out.println("Your Choises are ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		
		System.out.println("Enter Your Choice ");
		int choice = sc.nextInt();
		
		System.out.println("Details Are ");
		System.out.println("Your 1st Value is - "+number1);
		System.out.println("Your 2nd Value is - "+number2);
		System.out.println("Your Choice Value is - "+choice);
		
		performUsingSwitch(number1,number2,choice);
		
		
		
		
	}
	
	public void performUsingNestedIfElse(int number1,int number2,int choice) {
		if(choice == 1) {
			System.out.println("Result is "+(number1 + number2));
		}else if(choice == 2) {
			System.out.println("Result is "+(number1 - number2));
		}else if(choice == 3) {
			System.out.println("Result is "+(number1 * number2));
		}else if(choice == 4) {
			System.out.println("Result is "+(number1 / number2));
		}else {
			System.out.println("Choice is Invalid");
		}
	}
	
	public static void performUsingSwitch(int number1,int number2,int choice) {
		switch(choice) {
		case 1: 
			System.out.println("Result is "+(number1 + number2));
			break;
		case 2:
			System.out.println("Result is "+(number1 - number2));
			break;
		case 3:
			System.out.println("Result is "+(number1 * number2));
			break;
		case 4:
			System.out.println("Result is "+ (number1 / number2));
			break;
		default:
			System.out.println("Choice is Invalid");
		}
	}

}
