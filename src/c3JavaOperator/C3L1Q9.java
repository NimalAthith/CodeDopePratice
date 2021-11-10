package c3JavaOperator;

import java.text.DecimalFormat;

/*
 * If the marks of Robert in three subjects are 78,45 and 62 respectively
 * (each out of 100 ), write a program to calculate his total marks and
 * percentage marks.
 */

public class C3L1Q9 {
	
	public static void main (String args[]) {
		int s1 = 78, s2 = 45, s3 = 62;
		
		int total =  s1+s2+s3;
		
		float percent = ((float)total/(3*100))*100;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("Total Mart = " + total +"\nTotal Percent = " + df.format(percent)+ "%");
	}

}
