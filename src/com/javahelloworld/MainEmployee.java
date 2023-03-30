package com.javahelloworld;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Employee emp1=new Employee(363637,"Mr. Kumar",50000,"kumar@gmail.com",83839393);
		
		emp.displayEmployeeDetails();
		emp1.displayEmployeeDetails();
		
		
		emp.salaryCheck();
		emp1.salaryCheck();

	}

}
