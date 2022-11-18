package TipsandTricks;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Thread
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		for(String element:list) {
			System.out.println(element);
		}
		
	}
}
