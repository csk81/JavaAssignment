package com.assign3.Q4;

public abstract class Employee {
	int empId;
	int leaves;
	String empName;
	double basicPay;
	Address address = new Address();
	public abstract double calculateSalary();
}
