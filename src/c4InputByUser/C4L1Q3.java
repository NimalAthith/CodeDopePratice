package c4InputByUser;

import java.util.Scanner;

/*
 * Ask user to give two double input for length and breadth of a rectangle and 
 * print area type casted to int.
 */

public class C4L1Q3 {
	public static void main(String args[]) {
		double n1, n2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your 1st No. : ");
		n1 = in.nextDouble();
		System.out.println("Enter your 2nd No. : ");
		n2 = in.nextDouble();
		in.close();
		
		System.out.println("Product : " + (int) (n1*n2));
	}

}
