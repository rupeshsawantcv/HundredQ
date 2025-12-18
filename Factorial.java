package Mock;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		
		Scanner sc =  new Scanner(System.in);
		long num = sc.nextInt();
		long result= findFactorialUsingRecursion(num);
		long resultOne = findfactorial(num);
		
		System.out.println("The Factorial using normal method "+num+" is "+resultOne);
		System.out.println("The Factorial using recrusion "+num+" is "+result);
	}

	private static long findfactorial(long num) {
		if (num < 0) {
	        throw new IllegalArgumentException("Factorial is not defined for negative numbers");
	    }
		if(num==0 || num==1) {
			return num;
		}
		long fact = 1;
		for(int i =1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}

	private static long findFactorialUsingRecursion(long num) {
		if (num < 0) {
	        throw new IllegalArgumentException("Factorial is not defined for negative numbers");
	    }
		if(num==0 || num==1) {
			return num;
		}
		 return num*findFactorialUsingRecursion(num-1);
		
		
		
	}

}
