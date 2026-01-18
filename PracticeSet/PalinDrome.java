package com.basic;

import java.util.Scanner;

public class PalinDrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number:  ");
		int num = sc.nextInt();
		if(isPalindrome(num)) {
			System.out.println(num+"is palindrome");
		}else {
			System.out.println(num+"is not palindrome");
		}

	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		int oiriginalNum = num;
		int reversNum = 0;
		while(num>0) {
			int LastDigit = num %10;
			reversNum = reversNum *10+ LastDigit;
			num /=10;
		}
		return oiriginalNum == reversNum;
	}

}
