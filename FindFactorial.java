package forLearning;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1; i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + num + " is : " + fact);
		
		System.out.println("The factorial of(Using Recursion) " + num + " is : " + findFact(num));
	}

	private static int findFact(int num) {
		if(num == 0 || num == 1) return 1;
		return num * findFact(num-1);
	}

}
