package c3JavaOperator;
/*
 * 
Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

 */
public class C3L1Q3 {
	public static void main (String[] args) {
		System.out.println(((2345+8)/3%5)*5);
		System.out.println((((8+2345)/3)%5)*5);
	}
}
