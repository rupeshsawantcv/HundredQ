
package forLearning;

import java.util.Scanner;

public class FindPrimeTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		
		System.out.println("for Single Number");
		if (isPrime(num)) {
			System.out.println(num + " is Prime Number");
		} else {
			System.out.println(num + " is not Prime Number");
		}
		
		System.out.println("for for UpTo");
		
		for(int i = 0; i<num;i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		
		for(int i =2; i<=Math.sqrt(num);i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

}
