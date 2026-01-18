package com.Basic;

import java.util.Scanner;

class Simple{
	int a = 10;
	int b= 20;
	int c = 30;
	public void  getLarg() {
		
		if(a>b&&a>c)
		{
			System.out.println("a is Large");
			System.out.println("using simple way");
		}else if(b>c) {
			System.out.println("b is Large");
			System.out.println("using simple way");
		}else {
			System.out.println("c is Large");
			System.out.println("using simple way");
		}	
	}
}






public class FindLargestNumber {
	
	int FirstNumber;
	int SecondfNumber;
	int ThirdNumber;
	 FindLargestNumber(int num1, int num2, int num3){
		 
		 this.FirstNumber=num1;
		 this.SecondfNumber=num2;
		 this.ThirdNumber=num3;
		 
	 }
	 public void Calculate() {
		 if(FirstNumber>SecondfNumber && FirstNumber>ThirdNumber ) {
			 System.out.println("Largest number is : " +FirstNumber );
			 System.out.println("using scanner class, costructor and method");
		 }else if(SecondfNumber>ThirdNumber) {
			 System.out.println("Largest number is : " +SecondfNumber );
			 System.out.println("using scanner class, costructor and method");
		 }else if(FirstNumber==SecondfNumber && SecondfNumber==ThirdNumber){
			 System.out.println("All values are same! please provide diff values");
			 System.out.println("using scanner class, costructor and method");
		 }
		 else {
			 System.out.println("Largest number is : " +ThirdNumber );
			 System.out.println("using scanner class, costructor and method");
		 }
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int num1 =sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		FindLargestNumber FL = new FindLargestNumber(num1, num2, num3);
		FL.Calculate();
		sc.close();
		Simple s1= new Simple();
		System.out.println("-----------------------------------------------------");
	    s1.getLarg();
	    
		
		
	}

}
