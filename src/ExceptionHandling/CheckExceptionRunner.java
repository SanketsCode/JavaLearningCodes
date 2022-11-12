package ExceptionHandling;

public class CheckExceptionRunner {
	public static void main(String[] args) {
		try {
			someOtherMethod();
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	private static void someOtherMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
	}

}
