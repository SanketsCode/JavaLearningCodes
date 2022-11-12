 package Arrays;

public class CreationOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] marks = {1,2,3};
		int[] marks2 = new int[5];
		
		marks2[0] = 10;
		marks2[1] = 11;
		marks2[2] = 12;
		
//		System.out.println(marks2[0]);
		
		
		//Task
		int[] marks = {10,20,30,40,11,12,13,14};
		
//		for(int mark:marks) {
//			System.out.println(mark);
//		}
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]); 
		}
		
	}

}
