package org.ssglobal.training.codes.itemH;

public class TestProduct {
	public static void main (String[] args) {
		Product lamp = new Product(); // instantiate
		lamp.prodName = "IKEA Lamp"; // replace the variable name
		lamp.prodQty = 10000; // replace the variable name
		
		System.out.println("Before the loading: " + lamp.print());
		lamp.downLoad(1000);
		lamp.upLoad(100);
		System.out.println("After the loading: " + lamp.print());
	}
}