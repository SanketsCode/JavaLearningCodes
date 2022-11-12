package AdvanceOOPS;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan = new Fan("Manufacture 1",12.7,"red");
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		
		System.out.println(fan);
	}

}
