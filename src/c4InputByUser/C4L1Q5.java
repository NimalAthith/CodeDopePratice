package c4InputByUser;

import java.util.Scanner;

/*
 * Take side of a square from user and print area and perimeter of it.
 */
public class C4L1Q5 {
	public static void main(String args[]) {
		int a;
		System.out.println("Enter side of Square : ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		int area = a * a, perimeter = 4*a;
		
		System.out.println("Area of Square is "+ area + ", Perimeter of square is " + perimeter);
		
	}

}
