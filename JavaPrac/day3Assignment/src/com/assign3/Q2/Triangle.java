package com.assign3.Q2;

public class Triangle extends Shape{
	Triangle() {}
	Triangle(float h, float b) {
		super.height = h;
		super.base = b;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle height is " + height + "cm and Base is " + base + "cm \n");	
	}

	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return (height * base)/2;
	}
	public String toString() {
		draw();
		return "Area of Triangle is " + calcArea() + "cm\n";
	}
}
