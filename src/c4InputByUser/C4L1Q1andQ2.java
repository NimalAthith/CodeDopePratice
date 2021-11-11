package c4InputByUser;

import java.util.Scanner;

/*
 * Write a program to take two integer inputs from user and 
 * print sum and product of them.
 */ 
public class C4L1Q1andQ2 {
	public static void main(String args[]) {
		int n1, n2;
		System.out.println("Enter your first No. : ");
		
		Scanner in = new Scanner(System.in);
		n1 = in.nextInt();
		
		System.out.println("Enter your second No. : ");
		n2 = in.nextInt();
		
		in.close();
		
		//sum
		int sum = n1 + n2;
		
		int product = n1 * n2;
		
		System.out.println("Sum : " + sum + "\tProduct : " + product);
	}

}
