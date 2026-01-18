package com.Basic;

import java.util.Scanner;

public class TryReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rem;
		int rev = 0;
		while(num!=0) {
			rem = num%10; //Extract last digit
			rev=rev*10+rem; //update rev and add 
			num/=10; //remove last digit
			
		}
		System.out.println(rev);
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String name = sc1.next();
		int len = name.length(); //find the total length off string 
		String reverse = ""; //empty variable to store reverse string
		
		for(int i=len-1;i>=0;i--) { //  start from end of string and go end to start, with i-- 
			reverse = reverse+name.charAt(i); //update reverse using chartAt method
			
		}
		System.out.print(reverse);
		
		
	}

}
