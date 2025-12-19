
//Write a program to swap two numbers without using a third variable.

import java.util.*;

class FindProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int product= 1;
        while(num !=0){
         int digits = num%10;
         product = product*digits;
         num = num/10;
        }
        
        System.out.println("The produt of digits is: "+product);
    }
}
