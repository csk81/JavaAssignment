package com.assign3.Q1;

public class UsingEmployee {
	public static void main(String[] args) {
		Manager man = new Manager(1122, "Rajesh", 700);
		Developer dev = new Developer(2233, "Ramesh", 600);
		Tester test = new Tester(4455, "Suresh", 500);
		man.display();
		dev.display();
		test.display();
	}
}
