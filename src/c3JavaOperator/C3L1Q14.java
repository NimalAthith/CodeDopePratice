package c3JavaOperator;
/*
 * Take a 4 digit number. Write a program to display a number whose digits are 2 
 * greater than the corresponding digits of the number TAKEN.
 * For example, if the number which was taken is 5696, then the displayed number 
 * should be 7818.
 */
public class C3L1Q14 {
	public static void main(String args[]) {
		
		int given = 5696, out;
		
		System.out.println(given);
		
		int first = given/1000;
		first = first+2;
		if (first >= 10) {
			first = first%10;
		}
		
		
		given = given%1000;
				
		int second = given/100;
		second = second+2;
		if (second >= 10) {
			second = second%10;
		}
		
		given = given%100;
		
		int third = given/10;
		third = third + 2;
		if (third >= 10) {
			third = third%10;
		}
		
		given = given%10;
		
		int fourth = given+2;
		if (fourth >= 10) {
			fourth = fourth%10;
		}
		
		
		System.out.println(String.valueOf(first)+String.valueOf(second)+String.valueOf(third)+String.valueOf(fourth));
		
		
		
		
		
	}
	

}
