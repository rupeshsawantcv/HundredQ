
//Write a program to swap two numbers without using a third variable.

import java.util.*;

class RemovingLastNumberInDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("The Original Number: "+num);
        int afterRemovingLastNumber = num/10;
        System.out.println("After Removing last digits: "+afterRemovingLastNumber);
    }
}
