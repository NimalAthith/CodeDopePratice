package c4InputByUser;

import java.util.Scanner;

/*
 * Take two different string input and print them in same line. E.g.-
 * INPUT : Codes
 * Dope
 * OUTPUT : CodesDope
 */
public class C4L1Q7 {
	public static void main(String args[]) {
		System.out.print("INPUT : ");
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		in.close();
		
		System.out.println("OUTPUT : " + s1+s2);
		
	}

}
