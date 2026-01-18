package BasicSecond;

import java.util.Arrays;
import java.util.Scanner;

public class FindPrimeAndItsOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int avg = 0;
		int index = 0;
		int prime[] = new int[100];

		for (int i = 2; i <= num; i++) {
//			System.out.println("between 1 to "+num+" prime number are follows: "+i+" ");
			if (isPrime(i)) {
				prime[index]=i;
				index++;
				System.out.print(i+" ");
			}
		}
		

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
