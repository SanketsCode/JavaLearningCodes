package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String[] args) {
		String str = "This is an awesome occasion." + "This has never happened Again";
		
		Map<Character,Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for (char c : characters) {
			//get the character
			Integer integer = occurances.get(c);
			// if it there we increment the count
			if(integer == null) {
				occurances.put(c, 1);
			}else{
				occurances.put(c, integer + 1);
			}
			
		}
		
		System.out.println(occurances);
	}

}
