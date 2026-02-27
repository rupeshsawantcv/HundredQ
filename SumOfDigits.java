package forLearning;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}

		System.out.println("The sum of digits is: " + sum);
		
		int usingRecursion = findSum(temp);
		
		System.out.println("The sum of digits is(using recursion): " + usingRecursion);

	}

	public static int findSum(int num) {
		
		
		if(num==0) return 0;
		
		
		return (num%10)+findSum(num/10);

	}
}
