package Inheriatance;

public class Student extends Person {
	private String collageName;
	private int year;

	Student(String name, String email, String PhoneNumber) {
		super(name, email, PhoneNumber);
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public String toString() {

		return String.format("name - [%s] email - [%s] phoneNumber - [%s] collageName - [%s] year - [%d]" , getName(), getEmail(),getPhoneNumber(),collageName, year);
	}

}
