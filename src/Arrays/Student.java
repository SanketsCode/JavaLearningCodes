package Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
	
	private String name;
	private ArrayList<Integer> list_of_marks = new ArrayList<Integer>();
	
	Student(String name, int... list_of_marks){
		this.name = name;
//		this.list_of_marks = list_of_marks;
		for (int i : list_of_marks) {
			this.list_of_marks.add(i);
		}
	}
	



	public int getNumberOfMask() {
		return this.list_of_marks.size();
	}
	
	
	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i : list_of_marks) {
			sum += i;
		}
		
		return sum;
	}
	
	public int getMaximumMarks() {
//		int MAX = Integer.MIN_VALUE;
//		for (int i : list_of_marks) {
//			if(i >= MAX) {
//				MAX = i;
//			}
//		}
//		
//		return MAX;
		
		return Collections.max(list_of_marks);
		
	}
	
	public int getMinimumMarks() {
//		int MIN = Integer.MAX_VALUE;
//		for (int i : list_of_marks) {
//			if(i <= MIN) {
//				MIN=i;
//			}
//		}
//		return MIN;
		
		return Collections.min(list_of_marks); 
	}
	
	public void addNewMark(int mark) {
		list_of_marks.add(mark);
	}
	
	public void removeMarkAtIndex(int i) {
		list_of_marks.remove(i);
	}
	
	public BigDecimal getAverageMarks() {
		BigDecimal AvarageMarks = new BigDecimal( getTotalSumOfMarks()).divide(new 			BigDecimal(getNumberOfMask()),3,RoundingMode.UP);
		return AvarageMarks;
	}

}
