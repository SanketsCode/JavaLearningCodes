package AdvanceOOPS;

public class Fan {
	
	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	//creation
	public Fan(String make,double radius,String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public void switchOn() {
		this.isOn = true;
		this.speed=(byte)1;
	}
	
	public void switchOff(){
		this.isOn = false;
		this.speed = (byte)0;
	}
	
	public String toString() {
		return "make - "+make+" radius - "+radius+" color - "+color+" isOn - "+isOn+" speed - "+speed;
	}
	

	
	
}
