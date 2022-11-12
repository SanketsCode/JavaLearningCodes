package Inheriatance;

public class Person {

	private String name;
	private String email;
	private String PhoneNumber;
	
	Person(String name,String email,String PhoneNumber){
		this.name = name;
		this.email = email;
		this.PhoneNumber = PhoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
}
