package c3JavaOperator;

import java.util.Scanner;

/*
 * Write a program to reverse a 3-digit number. E.g.-Number : 132        
 * Output : 231
 */
public class C3L1Q16 {
	
	public static int findDigit(int num) {
		int count = 0;
		while (num != 0) {
			
			num /= 10;
			count++;
		}
		return count;
	}
	
	public static int power(int no, int base) {
		int pw;
		
		if (no == 1) {
			return base;
		}
		
		else {
			pw = base;
			for (int i = 1; i < no; i++) {
				pw *= base;
			}
			return pw;
		}
		
	}
	
	public static int reverseDigit(int noOfDigit, int value) {
		
		int n = 10, reverse = 0, base = power((noOfDigit - 1), 10);
		
		
		for(int i = 0; i < noOfDigit; i++ ) {
			
			reverse += ((value%n)*base);
			value /= 10; 
			base /= 10;
			
		}
		return reverse;
	}
	
	public static void main(String args[]) {
		int value ;
		
		System.out.println("Enter your Digit to Reverse : ");
		Scanner in = new Scanner(System.in);
		
		value = in.nextInt();
		
		System.out.println(reverseDigit(findDigit(value), value));
	}

}
