package Inheriatance;

import java.math.BigDecimal;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Sanket", "sanket@gmail.com", "1234567");
		employee.setEmployeeName("Sanket");
		employee.setEmployeeGrade('A');
		employee.setSalary(new BigDecimal(4000));
		employee.setTitle("Data Engineer");
		System.out.println(employee);
	}

}
