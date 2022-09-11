package com.assign3.Q2;

public class Square extends Shape{
	Square() {}
	Square(float s) {
		super.side = s;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Side of Square is" + side + "cm");
	}

	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
	public String toString() {
		draw();
		return "Area of Square is " + calcArea() + "cm\n";

}
}