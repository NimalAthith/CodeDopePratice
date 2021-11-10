package c3JavaOperator;
/*
 * Write a program to calculate the sum of the first and the second last digit of a 5 digit.
 * E.g.- NUMBER : 12345        OUTPUT : 1+4=5
 */
public class C3L1Q13 {
	public static void main (String args[]) {
		
		int n = 12345;
		
		int n1 = n / 10000;
		
		
		n = n%100;
		n = n/10;
		
		
		
		System.out.println("First Digit = " + n1 + "\nSecond Last Digit = " + n + "\nSum = " + (n+n1));
		
		
		
	}

}
