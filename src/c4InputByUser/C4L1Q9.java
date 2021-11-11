package c4InputByUser;

import java.util.Scanner;

/*
 * Write a program to enter the values of two variables 'a' and 'b' 
 * from keyboard and then check if both the conditions
 * 'a < 50' and 'a < b' are true.
 */
public class C4L1Q9 {
	public static void main(String args[]) {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value for a : ");
		a = in.nextInt();
		System.out.println("Enter value for b : ");
		b = in.nextInt();
		in.close();
		
		System.out.println("\n\na < 50 is " + (a < 50));
		System.out.println("a < b is " + (a < b));
		
	}

}
