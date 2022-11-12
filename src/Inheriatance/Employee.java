package Inheriatance;

import java.math.BigDecimal;

public class Employee extends Person {

	Employee(String name, String email, String PhoneNumber) {
		super(name, email, PhoneNumber);
		// TODO Auto-generated constructor stub
	}
	private String title;
	private String employeeName;
	private char employeeGrade;
	private BigDecimal salary;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return "Person Name "+ super.getName() + " title - "+title+ " employeeName - "+employeeName+" employeeGrade - "+employeeGrade;
	}
	
	
}
