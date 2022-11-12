package ObjectOrientedProgramming;

public class MotorBikeRunner  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MotorBike ducati = new MotorBike(10);
		
		MotorBike Honda = new MotorBike(10);
		
		ducati.start();
		Honda.start();
		
//		ducati.speed = 100;
//		Honda.speed = 70;
		
		ducati.setSpeed(100);
//		Honda.setSpeed(80);
		
		System.out.println(ducati.getSpeed());
		System.out.println(Honda.getSpeed());
			

	}
	
	

}
