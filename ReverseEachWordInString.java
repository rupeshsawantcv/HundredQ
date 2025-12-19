package hundredq.String;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
//		String str = "Rupesh Sawant";
		System.out.println("The Original String is: " + str);
		reverseStringOne(str);
	}
	public static void reverseStringOne(String str) {
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}
		System.out.println("'From Method'The Reverse String is: " + rev);

	}

}
