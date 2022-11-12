package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> characters = List.of('A','B','Z','A','Z','G','S');
		//unique - Set
		//Tree
		//Hash
		//LinkedHash
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("tree set "+treeSet);
		
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("Hash Set "+hashSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("Linked Hash Set "+linkedHashSet);
		
	}

}
