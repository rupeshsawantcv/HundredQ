package forLearning;

import java.util.Scanner;

public class PrintFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms: ");

		int num = sc.nextInt();
		int a = 0;
		int b = 1;

		System.out.println();
		if (num <= 0) {
			System.out.println("Enter a positive number!!");
			return;
		} else if (num == 1) {
			System.out.println(a);
			return;
		} else {

			for (int i = 0; i < num; i++) {
				System.out.print(fib(i) + " ");
			}
			System.out.println();
			System.out.print(a + " ");
			System.out.print(b + " ");

			for (int i = 2; i < num; i++) {
				int temp = a + b;
				System.out.print(temp + " ");
				a = b;
				b = temp;
			}
		}

	}

	private static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fib(n - 1) + fib(n - 2);
	}

}
