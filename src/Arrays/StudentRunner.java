package Arrays;

public class StudentRunner {
	
	public static void main(String[] args) {
		
//		int[] Marks = {40,60,80,90};
		
		Student student = new Student("Sanket",40,60,80,90);
		System.out.println("Number of Marks is  - "+student.getNumberOfMask());
		System.out.println("Total Sum of Marks is - "+student.getTotalSumOfMarks());
		System.out.println("Get Maximum Number of Marks - "+student.getMaximumMarks());
		System.out.println("Get Minimum Marks - "+student.getMinimumMarks());
		System.out.println("Get Avarage Number of Marks - "+student.getAverageMarks());
		
	}

}
