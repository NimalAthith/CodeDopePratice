package c4InputByUser;

import java.util.Scanner;

/*
 * Take 3 inputs from user and check :
 * all are equal
 */
public class C4L1Q8 {
	public static void main(String args[]) {
		int n1, n2, n3;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value 1 : ");
		n1 = in.nextInt();
		System.out.println("Enter value 2 : ");
		n2 = in.nextInt();
		System.out.println("Enter value 3 : ");
		n3 = in.nextInt();
		
		System.out.println("\n\nAll values are equal : " + (n1 == n2 && n2 == n3 && n3 == n1) );
		System.out.println("\n\nAny of two values are equal : " + (n1 == n2 || n2 == n3 || n3 == n1) );
	}

}
