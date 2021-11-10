package c3JavaOperator;

import java.util.Scanner;

/*
 * Write a program to calculate the sum of the digits of a 3-digit number.
 * Number : 132        Output : 6
 */

public class C3L1Q15 {
	public static void main (String args[]) {
		
		int num, sum=0, n=0, count=0, base = 1, anum;
		
		System.out.println("Enter num to sum it's Digit : ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		anum = num;
		
		while(num%10 != 0) {
			num = num/10;
			base = 10 * base;
			count++;
		}
		
		base /= 10;
		
		
		
		System.out.println(base + " " + count);
		
		for(int i=0; i < count; i++) {
			n = anum/base;
			anum = anum%base;
			
			base /=10;
			sum = sum + n;
			
		}
		
		System.out.println("\n"+sum);
		
		
		
	}

}
