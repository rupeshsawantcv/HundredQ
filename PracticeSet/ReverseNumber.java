package com.Basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int rem;
		int rev = 0;
		
		String name = "Rupesh Sawant";
		String reverse = "";
		int leng = name.length();
		
		while(num !=0) {
			rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		for(int i = leng-1; i>=0;i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println(reverse);
		
		

	}

}
