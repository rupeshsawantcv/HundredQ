	package com.basic;
	
	public class SwapNumber {
		
		public static int Fibonacci(int n) {
			if(n<=1) {
				return n;
			}
			return  Fibonacci(n-1)+Fibonacci(n-2);
		}
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a = 10;
			for(int i = 0; i<a;i++) {
				System.out.println(Fibonacci(i)+" ");
				
			}
			
	
		}
	
	}
