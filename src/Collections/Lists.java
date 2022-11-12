package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lists {
	public static void main(String[] args) {
		List<String> words = List.of("Apple","Bat","cat");
		
//		System.out.println(words.size());
//		System.out.println(words.get(0));
		
		List<String> wordsArray = new ArrayList<String>(words);
		wordsArray.add("Fish");
		
		//Removing from Array 
//		wordsArray.remove(2); //removing by index
//		wordsArray.remove("Apple");
		
		System.out.println(wordsArray);
		
		//Vector
		List<String> vectorList = new Vector<String>();
		vectorList.add("Animals");
		vectorList.addAll(wordsArray);
		
		System.out.println(vectorList);
	}
 
}
