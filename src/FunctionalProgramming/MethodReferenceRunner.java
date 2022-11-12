package FunctionalProgramming;

import java.util.List;

public class MethodReferenceRunner {
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Dog","Elephant").stream()
		.map(s -> s.length())
		.forEach(System.out::println);
		
		// .forEach(MethodReferenceRunner::print);
	}

}
