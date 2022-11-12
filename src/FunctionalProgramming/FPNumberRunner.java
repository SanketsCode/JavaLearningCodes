package FunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
 public static void main(String[] args) {
	List<Integer> numbers = List.of(4,6,8,13,3,15);
//	numbers.stream().forEach(element -> System.out.println(element));
	int sum = 0;
//	for(int number:numbers) {
//		sum += number;
//	}
	
//	sum = numbers.stream().reduce(0,(number1,number2) -> number1 + number2);
	
	
	
//	System.out.println("Sum of number "+sum);
	
	//sum of odd numbers
	
//	sum = numbers.stream().filter(num -> num%2!=0).reduce(0,(num1,num2) -> num1+num2);
//	
//	System.out.println("Sum of odd numbers "+sum);
	
	
	//Print Square of first 10 number
	IntStream.range(0, 10).forEach(num -> System.out.println(num*num));
}
}
