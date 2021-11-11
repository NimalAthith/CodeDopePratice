package c4InputByUser;

import java.util.Scanner;

/*
 * Take name, roll number and field of interest from user and print 
 * in the format below :
 * Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
 */
public class C4L1Q4 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		String name, rollNo, intrest;
		
		System.out.print("Enter your Name : ");
		name = in.next();
		System.out.print("Enter your Roll No : ");
		rollNo = in.next();
		in.nextLine();
		System.out.print("Enter your Field of Intrest are : ");
		intrest = in.nextLine();
		in.close();
		
		System.out.println("\nHey, my name is " + name + " and my roll number is " + rollNo + ". My Field of intrest are " + intrest);
	}

}
