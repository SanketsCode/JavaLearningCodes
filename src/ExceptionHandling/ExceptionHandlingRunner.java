package ExceptionHandling;

public class ExceptionHandlingRunner {
	public static void main(String[] args) {
//		String str = null;
//		str.length(); throw an error
		
		method1();
		
		
		
	}
	
	public static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}
	
	public static void method2() {
		String str = null;
		str.length();
		System.out.println("Method2 Ended");
	}

}
