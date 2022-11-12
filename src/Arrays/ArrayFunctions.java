package Arrays;

import java.util.Arrays;

public class ArrayFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[5];
		
		Arrays.fill(marks, 100);
		
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3};
		
		System.out.println(Arrays.equals(array1, array2));
		
		int[] array3 = {5,2,3,1,8};
		
		Arrays.sort(array3);
		for (int i : array3) {
			System.out.print(i + " ");
		}
	}

}
