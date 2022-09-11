package com.assign3.Q2;

public class Rectangle extends Shape{
	Rectangle() {}
	Rectangle(float l, float w) {
		super.length = l;
		super.width = w;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Length of Rectangle is " + length + "cm and Width is" + width + "cm");
	}

	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	public String toString() {
		draw();
		return "Area of Rectangle is " + calcArea() + "cm\n";

}}
