package forLearning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		System.out.println("Original Number: " + num);

		// using while loop
		System.out.print("Reverse Using While loop: ");
		while (num > 0) {
			System.out.print(num % 10);
			num = num / 10;

		}

		// using recursion
		int numOne = recursiveRev(temp, 0);
		System.out.println();
		System.out.print("Reverse Using Recursion loop: " + numOne);
	}

	
	static int recursiveRev(int num, int rev) {
		if (num == 0)
			return rev;

		
		return recursiveRev(num /10,rev*10+num%10);

	}

}
