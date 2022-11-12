package generics;

import java.util.List;

public class GenericsRunner {
	static <X> X doubleValue(X  value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(4));
		System.out.println(list2);
		
		
	}

}
