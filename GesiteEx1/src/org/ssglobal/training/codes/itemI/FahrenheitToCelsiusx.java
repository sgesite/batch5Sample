package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsiusx {
	public static void main(String[] args) {
		// declare and initialize data
		double celsius = 0;
		double fahrenheit = 22.6;
		// calculate celsius equivalent
		celsius = (fahrenheit - 32) * 5 / 9;
		
		// output results
		System.out.print(fahrenheit + "\u00B0F = ");
		System.out.print(celsius + "\u00B0C");
	}
}

// Compiler error (8):
//Need casting or change of data-type in the declared variable Celsius
//Need casting or change of data-type in the declared variable Fahrenheit
//Initialize Celsius to 0
//fahrenheit is missplelled/does not match the declared variable (line 9)
//celcius is does not match the declared variable (line 12)
//incorrect value \u
//no + operators used to concat the variable and string (line 11, 12)
//remove comma(,) in line 11 and 12
//Logic Error (3):
//Redundant declaration of celsius
//Wrong formula for celsius
//Variable Celsuis and Fahrenheit is not in lowercase or camel-case
//User Experience (3):
//Space in String array argument in the main()
//Space inside the println statement (line 11,12)
// spelling for celcius	 
//Readability Error (1):
//Need space after each comments (line 5,8,10)
