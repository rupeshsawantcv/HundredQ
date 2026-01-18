package BasicSecond;
import java.util.Scanner;

import java.util.Scanner;

public class FindArmstrongUpto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digit=0;
        if(number<10) {
        	return true;
        }
        
        while (number > 0) {
             digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
            
        }
        return sum == original;
    }
}
