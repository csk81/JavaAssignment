package com.assignment4.Q1;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	List<Student> students = new ArrayList<>();
	public List<Student> getStudent(){
		students.add(new Student(111, "sai", 90));
		students.add(new Student(222, "kiran", 80));
		students.add(new Student(333, "rohit", 88));
		students.add(new Student(444, "ram", 77));
		students.add(new Student(555, "shree", 95));
		return students;
	}
	public List<Student>getStudentsSort() {
		List<Student> students = new StudentList().getStudent();
		students.sort((o1, o2)-> o2.getMarks() - o1.getMarks());
		return students;
	}
	public static void main(String args[]) {
		System.out.println("before sorting : " + new StudentList().getStudent() + "\n");
		System.out.println("after sorting" + new StudentList().getStudentsSort());
	}
}
