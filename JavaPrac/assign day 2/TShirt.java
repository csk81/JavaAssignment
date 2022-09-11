package com.sonata.assignment;

public class TShirt {
	String color,material,design;
	TShirt (){}
	TShirt ( String c , String m , String d ) {
		this.color = c;
		this.material = m;
		this.design = d;
	}
	public static void main(String[] args) {	
		TShirt[] small = new TShirt[3];
		small[0] = new TShirt( "blue" , "Cotton" , "hoodie" );
		small[1] = new TShirt( "maroon" , "denim" , "oversized" );
		small[2] = new TShirt( "Green" , "Linen" , "solids" );
		TShirt[] medium = new TShirt[3];
		medium[0] = new TShirt( "blue" , "Cotton" , "hoodie" );
		medium[1] = new TShirt( "maroon" , "denim" , "oversized" );
		medium[2] = new TShirt( "Green" , "Linen" , "solids" );
		TShirt[] large = new TShirt[3];
		large[0] = new TShirt( "blue" , "Cotton" , "hoodie" );
		large[1] = new TShirt( "maroon" , "denim" , "oversized" );
		large[2] = new TShirt( "Green" , "Linen" , "solids" );		
		TShirt[] extraLarge = new TShirt[3];
		extraLarge[0] = new TShirt( "blue" , "Cotton" , "hoodie" );
		extraLarge[1] = new TShirt( "maroon" , "denim" , "oversized" );
		extraLarge[2] = new TShirt( "Green" , "Linen" , "solids" );		
		//Small
		System.out.println("\nSize - Small\n");
		for( int i = 0 ; i < small.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + small[i].color + "\nT-Shirt Material - " + small[i].material + "\nT-Shirt Design - " + small[i].design + "\n--------------------------------------------------" );
		}		
		//Medium
		System.out.println("\nSize - Medium\n");
		for( int i = 0 ; i < medium.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + medium[i].color + "\nT-Shirt Material - " + medium[i].material + "\nT-Shirt Design - " + medium[i].design + "\n--------------------------------------------------" );
		}
		//Large
		System.out.println("\nSize - Large\n");
		for( int i = 0 ; i < large.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + large[i].color + "\nT-Shirt Material - " + large[i].material + "\nT-Shirt Design - " + large[i].design + "\n--------------------------------------------------" );
		}
		//Extra-Large
		System.out.println("\nSize - Extra-Large\n");
		for( int i = 0 ; i < extraLarge.length ; i++ ) {
			System.out.println( "T-Shirt Color - " + extraLarge[i].color + "\nT-Shirt Material - " + extraLarge[i].material + "\nT-Shirt Design - " + extraLarge[i].design + "\n--------------------------------------------------" );
		}		
	}
}