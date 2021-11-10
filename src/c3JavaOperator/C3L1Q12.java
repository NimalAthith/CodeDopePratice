package c3JavaOperator;
/*
 * The total number of students in a class are 90 out of which 45 are boys. If 50% of the 
 * total students secured grade 'A' out of which 20 are boys, then write a program to
 * calculate the total number of girls getting grade 'A'.
 */

public class C3L1Q12 {
	
	public static void main(String args[]) {
		int total = 90, boys = 45, girls = 90 - 45;
		
		double valueForAGrade = total * 0.5;
		
		double ValueForAGradeGirl = valueForAGrade - 20;
		
		System.out.println(ValueForAGradeGirl);
		
		
	}

}
