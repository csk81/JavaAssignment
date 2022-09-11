package com.assignment4.Q2;

public class Product {
	private int prodId;
	private String prodName;
	private double Price;
	public Product(int prodId, String prodName, double Price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.Price = Price;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", Price=" + Price + "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
}
