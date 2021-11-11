package c4InputByUser;

import java.util.Scanner;

/*
 * Write a program to find square of a number.
 * E.g.-
 * INPUT : 2        OUTPUT : 4
 * INPUT : 5        OUTPUT : 25
 */
public class C4L1Q6 {
	public static void main(String args[]) {
		System.out.print("Enter number to find square : ");
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		in.close();
		
		System.out.println("Square of " + value + " is " + value*value + ".");
	}

}
