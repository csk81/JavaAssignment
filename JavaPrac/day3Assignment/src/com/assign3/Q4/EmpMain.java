package com.assign3.Q4;

public class EmpMain {
public static void main(String[] args) {
		TechEmployee te1 = new TechEmployee(81641, "sai", "core java", 30000, 3);
		Address tAdd = new Address(012, "Banashankari", "Bengaluru", 560085);
		te1.address = tAdd;
		
		Staff s1 = new Staff(89746, "kiran", "Staff", 10000, 4);
		Address sAdd = new Address(101, "mysore road", "Bengaluru", 560074);
		s1.address = sAdd;
		
		System.out.println(te1);
		System.out.println(s1);
	}
}
