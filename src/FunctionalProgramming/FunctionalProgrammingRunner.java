package FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple","Banana","Cat","Dog");
//		printBasic(list);
		printWithFPWithFiltering(list);
		
	}
	
	private static void printBasic(List<String> list) {
			for(String item:list) {
				System.out.println(item);
			}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String item:list) {
			if(item.endsWith("at")) {
				System.out.println(item);
			}
		}
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - "+element));
	}

}
