package DAACodes;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number - ");
		int num = sc.nextInt();
		if(num <= 1) {
			System.out.println(num);
			return;
		}
		
		int a=0;
		int b=1;
		System.out.println(a);
	
		
		for(int i=1;i< num;i++) {
			System.out.println(b);
			int temp =a;
			a=b;
			b+=temp;
		}
		

	}

}
