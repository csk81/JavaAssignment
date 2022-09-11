package com.assign3.Q4;

public class Address {
	int doorNo,pinCode;
	String street,city;
	Address () {}
	Address (int dNo , String strt , String city , int pin) {
		this.doorNo = dNo;
		this.street = strt;
		this.city = city;
		this.pinCode = pin;
	}
	public String toString() {
		return doorNo+", "+street+", "+city+" - "+pinCode;
	}
}
