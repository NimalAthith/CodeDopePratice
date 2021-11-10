package c3JavaOperator;

import java.util.Scanner;

/*
 * 
 * Write a program to convert Fahrenheit into Celsius.
 * 
 */
public class C3L1Q11 {
	public static void main(String args[]) {
		double cel, fahr;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Celcious value : ");
		cel = in.nextDouble();
		
		fahr = (cel * (9.0/5.0)) + 32;
		
		System.out.printf("\nFahernheit value is %.2f", fahr);
	}

}
