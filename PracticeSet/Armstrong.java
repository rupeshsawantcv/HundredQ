package com.basic;

import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a number to find itis armstrong or not: ");
		int num = sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num + "is armstrong");
		}else {
			System.out.println(num + "is not armstrong");
		}
				
	}

	private static boolean isArmstrong(int num) {
		// TODO Auto-generated method stub
		int originalNum = num;
		int sum = 0;
		int digits = String.valueOf(num).length();
		while(num>0) {
			int digit = num%10;
			double power = Math.pow(digit, digits);
			sum += power;
			num /=10;
		}
		return originalNum == sum;
	}
}