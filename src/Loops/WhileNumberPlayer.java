package Loops;



public class WhileNumberPlayer {

	private int number;

	public WhileNumberPlayer(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public void printSqauresUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;

		System.out.println("Squares Are ");
		while(i*i < number) {
			
			System.out.print(i*i + " ");
			i++;
			
		}
		System.out.println();
		
	}

	public void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i=1;
		
		System.out.println("Cubes Are ");
		while(i*i*i<number) {
			
			System.out.print(i*i*i + " ");
			i++;
		}
		System.out.println();
	}

}
