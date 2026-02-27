package forLearning;

import java.util.Scanner;

public class GCDandLCMExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first No: ");
		int a = sc.nextInt();
		System.out.print("Enter a first No: ");
		int b = sc.nextInt();
		System.out.println("GCD of numbers is: " + findGCD(a, b));
		System.out.println("LCM of numbers is: " + findLCM(a, b));

	}

	private static int findLCM(int a, int b) {

		int lcm = (a * b) / findGCD(a, b);
		return lcm;
	}

	private static int findGCD(int a, int b) {
		// TODO Auto-generated method stub
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
