package com.Basic;

import java.util.Scanner;

public class FactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int fact = 1; 
		
		for(int i=1; i<=num; i++ ) {
			fact = fact*i;
		}
		System.out.println("Factorial of number is: "+fact);
		try {
			int a = 10;
			int b= 2;
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Hello");
		}
	}
	

}
