package BasicSecond;

import java.util.Scanner;

public class CheckItIsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		
		int originalNumber = num;
		
		int rem= 0;
		int rev=0;
		
		while(num>0) {
			
			rem = num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		if(originalNumber==rev) {
			System.out.println(originalNumber+" = "+rev+" number is palindrome");
		}else {
			System.out.println(originalNumber+" != "+rev+" number is not palindrome");
		}
	}

}
