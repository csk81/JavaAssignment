package com.assignment4.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductList {
	List<Product> products = new ArrayList<>();
	public List<Product> getProducts() {
		products.add(new Product(111, "shirt", 1000));
		products.add(new Product(222, "polo", 800));
		products.add(new Product(333, "jeans", 2000));
		products.add(new Product(444, "jacket", 2000));
		products.add(new Product(555, "shoes", 3000));
		products.forEach(
				(Product p1)-> {
					if(p1.getPrice() < 0) {
						throw new RuntimeException("negative price");
					}
				}
		);
		return products;
		
}
	public List<Product>getProductsSort() {
		List<Product> products = new ProductList().getProducts();
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		return products;
	}
	int prodSize() {
		return products.size();
	}
	public static void main(String args[]) {	
		System.out.println("before sort" + new ProductList().getProducts() + "\n");
		System.out.println("after sort" + new ProductList().getProductsSort());
	}
}