package com.assign3.Q1;

public class Tester extends Employee{
	double yearlySal;
	Tester() {}
	Tester(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public void display() {
		System.out.print("Tester Details\n"+"employee id:" + empId + "\n employee name:" + empName + "\n monthly salary:" + empSal);
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println("\n yearly salary"+yearlySal + "\n");
	}
}
