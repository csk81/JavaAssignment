package com.assign3.Q3;

public class Employee{

	public static void main(String[] args) throws CustomExceptionn{
		// TODO Auto-generated method stub
		int yearlySalary = 600000;
		if(yearlySalary<100000) {
			throw new CustomExceptionn("Salary is less than 100000");
		}
		else {
				System.out.println("Salary is not less than 100000");
			}
	}

}
