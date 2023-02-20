package org.ssglobal.training.codes.itemA;

//Code 1
public class Oops {
	public static void main(String[] args) {
		int a = 7;
		int b = 42;
		int smaller;
		
		smaller = minimize(a, b);
		
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else if (smaller == b) {
			System.out.println("b is the smallest!");
		}
	}
	
	/*
	 	returns which int is smaller
	*/
	public static int minimize(int a, int b) {
		int smaller = 0;
		
		if (a < b) {
			smaller = a; 
		} else if (a >= b) {
			smaller = b;
		}
		
		return smaller;
	}
}