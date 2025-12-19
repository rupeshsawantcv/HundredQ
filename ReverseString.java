package hundredq.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		System.out.println("The Original String is: " + str);
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		System.out.println("The Reverse String is: " + rev);
		// using method

		reverseStringOne(str);
	}

	private static void reverseStringOne(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		System.out.println("'From Method'The Reverse String is: " + rev);

	}

}
