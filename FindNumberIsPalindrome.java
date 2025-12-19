

//Write a program to check whether a number is a palindrome.


import java.util.*;

class FindNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int OriginaNum = num;
        int rev = 0;
        while(num!=0){
            int digits=num%10;
            rev=rev*10+digits;
            num=num/10;
        }
        
        if(rev==OriginaNum){
            System.out.println(OriginaNum+" is Palindrome");
        }else{
            System.out.println(OriginaNum+" is not Palindrome");
        }
        }
    }
