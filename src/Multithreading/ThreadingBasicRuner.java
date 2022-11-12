package Multithreading;


//Using extends Thread
class Task1 extends Thread {
	public void run() {
		System.out.println("Task 1 Start ");
		for(int i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nTask 1 Complete");
		
	}
}


//using implements Runnable
class Task2 implements Runnable {
	public void run() {
		System.out.println("Task 2 Start");
		for(int i=11;i<=20;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("\nTask 2 Complete");
	}
	
}

public class ThreadingBasicRuner {
	public static void main(String[] args) throws InterruptedException {
		
		//Task 1
		Task1 task1 = new Task1();
		task1.setPriority(1); // 1 is  min priority
		task1.start();
	
		 
		//Task 2
		Task2 task2 = new Task2();
		Thread Task2thread = new Thread(task2);
		Task2thread.setPriority(10); // 10 is max priority
		Task2thread.start();
		
		//wait for task1 & task2 to complete
		task1.join(); 
		Task2thread.join();
		
		
		//Task 3
		
		for(int i=21;i<=30;i++) {
			System.out.print(i+ " ");
		}
		System.out.println("\nTask 3 Complete");
		
	}

}
