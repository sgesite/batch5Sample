package org.ssglobal.training.codes.itemA;

public class Temperature {
	public static void main(String[] args) {
		double fahrenheit = 98.6;
		double celsius = 0.0;
		
		celsius = temperatureConvertion(fahrenheit);
		System.out.println("Body temp in C is: " + celsius);
	}
	
	/*
	  Converts Fahrenheit temperatures to Celsius.
	 */
	public static double temperatureConvertion(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}