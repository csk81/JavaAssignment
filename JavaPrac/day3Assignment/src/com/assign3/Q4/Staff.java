package com.assign3.Q4;

public class Staff extends Employee{
	double salary;
	double HRA;
	String title;
	Staff() {}
	Staff(int id, String name, String title, double bPay, int nLeaves) {
		super.empId = id;
		super.empName = name;
		this.title = title;
		super.basicPay = bPay;
		super.leaves = leaves;
	}
	public double calcHRA() {
		HRA = 0.18 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Staff Details are \n "+"Employee ID: " + empId + "\n Name: " + empName + "\n Title:" + title + "\n Address:" + address + "\n Basic Pay: " + basicPay + "\n HRA: " + calcHRA() + "\n Salary: " + calculateSalary();
	}
}
