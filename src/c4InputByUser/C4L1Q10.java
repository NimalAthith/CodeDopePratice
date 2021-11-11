package c4InputByUser;

import java.util.Scanner;

/*
 * If the marks of Robert in three subjects are entered through keyboard
 * (each out of 100 ), write a program to calculate his total marks and 
 * percentage marks.
 */
public class C4L1Q10 {
	
	public static void main(String args[]) {
		int s1, s2, s3;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 3 Subject marks : ");
		System.out.print("S1 : ");
		s1 = in.nextInt();
		System.out.print("S2 : ");
		s2 = in.nextInt();
		System.out.print("S3 : ");
		s3 = in.nextInt();
		
		in.close();
		
		int total = s1 + s2 + s3;
		float percent = ((float)total / 300.00f) * 100.00f;
		
		System.out.println("\n\n\n\nTotal marks : " + total + " and Percentage Mark : " + percent);
		
	}

}
