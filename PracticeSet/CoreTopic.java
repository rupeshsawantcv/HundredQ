package com.Basic;

import java.util.Scanner;

public class CoreTopic {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		if ((year%400==0)||  (year%100!=0 && year%4==0) ){
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		sc.close();
	}

}
