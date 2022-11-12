package Loops; 

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(6);
		boolean isPrime  = number.Prime();
		System.out.println("isPrime "+isPrime);
		int sum = number.sumUptoN();
		System.out.println("Sum of Number "+sum);
		int sumOfDivisors = number.sumOfDivisor();
		System.out.println("Sum of Divisor "+sumOfDivisors);
		number.printNumberTriangle();
	}

}
