package c3JavaOperator;
/*
 * Write a program to print the power of 7 raised to 5.
 */
public class C3L1Q6 {

	public static void main(String[] args) {
		int n = 5, v = 7;
		
		for(int i = 0; i < (n-1); i++) {
			v *= 7;
		}
		
		System.out.println(v);
	}
}
