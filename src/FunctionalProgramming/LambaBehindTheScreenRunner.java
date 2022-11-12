package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicte implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		// TODO Auto-generated method stub
		return number%2==0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		// TODO Auto-generated method stub
		System.out.println(number);
		
	}
	
}

public class LambaBehindTheScreenRunner {
	public static void main(String[] args) {
		List.of(23,43,34,45,36,48).stream()
		.filter(n-> n%2 == 0)
		.forEach(e -> System.out.println(e));
	}

}
