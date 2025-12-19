
//Write a program to print digits of a number one by one.


import java.util.*;

class PrintDigitsOneByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int OriginaNum = num;
        System.out.println("The Original Number: "+num);
       
        String str = Integer.toString(OriginaNum);
        for(int i = 0; i<=str.length()-1;i++){
            System.out.println(str.charAt(i));
        }
    }
}
