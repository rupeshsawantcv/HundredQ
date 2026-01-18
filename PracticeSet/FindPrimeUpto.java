package com.basic;

public class FindPrimeUpto {

	  public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false; // Numbers less than 2 are not prime
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) { // Optimize using sqrt
	            if (num % i == 0) {
	                return false; // If divisible, not a prime
	            }
	        }
	        return true; // Prime number
	    }

    public static void main(String[] args) {
        int n = 10;
        for(int i = 2; i<=n;i++) {
        	if(isPrime(i)) {
        		System.out.print(i+"-");
        		
        	}
        }
    }
}
