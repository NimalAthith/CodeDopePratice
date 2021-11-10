package c3JavaOperator;

/*
 * 
 * Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write
 * two programs to swap the values of the two variables.
 * 1 - first program by using a third variable
 * 2 - second program without using any third variable
 * ( Swapping means interchanging the values of the two variables E.g.- If
 * entered value of x is 5 and y is 10 then after swapping the value of x and y
 * should become 10 and 5 respectively.)
 * 
 */

public class C3L1Q10 {
	public static void main(String args[]) {
		int a = 6, b = 8;
		
		//By using 3rd variable
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("With 3rd Variable" + "\na = " + a + "\nb = " + b);
		
		
		//without 3rd variable
		
		b = b-a;
		a = b + a;
		b = a - b;
		
		System.out.println("\n\nWithout 3rd Variable" + "\na = " + a + "\nb = " + b);
	}

}
