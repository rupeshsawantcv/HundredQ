package BasicSecond;

import java.util.Scanner;

public class FindSomeOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int Number = sc.nextInt();
		int sum=0;
		String num = String.valueOf(Number);
		for(int i = 0;i<=num.length();i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		

	}

}
