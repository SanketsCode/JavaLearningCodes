package ExceptionHandling;

public class ExceptionHandlingRunner2 {
	
		public static void main(String[] args) {

			method1();
			System.out.println("Main Method Ended");
			
		}
		
		public static void method1() {
			method2();
			System.out.println("Method1 Ended");
		}
		
		public static void method2() {
			try {
//				String str = null;
//				str.length();
				
				int[] i = {1,2};
				int number = i[3];
				System.out.println("Method2 Ended");
			}catch(NullPointerException ex) {
				System.out.println("Null Pointed Exception");
				ex.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
				System.out.println("Array Index out of Bound");
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Just Exceptions");
			}
		}


}
