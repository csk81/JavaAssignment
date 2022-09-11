package com.assign3.Q4;

public class TechEmployee extends Employee{
	double salary;
	double HRA;
	String skill;
	TechEmployee() {}
	TechEmployee(int id, String name, String skill, double bPay, int nLeaves) {
		super.empId = id;
		super.empName = name;
		this.skill = skill;
		super.basicPay = bPay;
		super.leaves = leaves;
	}
	public double calcHRA() {
		HRA = 0.12 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Technical Employee Details are"+"employee id: " + empId + "\n Name:" + empName + "\n Skill: " + skill + "\n Address: " + address + "\n Basic Pay: " + basicPay + "\n HRA: " + calcHRA() + "\n Salary: " + calculateSalary();
	}
}
