
// Write a program to check whether a string is a palindrome.
import java.util.*;
class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String originalString = str;
        
        
        int len = str.length();
        System.out.println("The Length of String is: "+len);
        
       String rev =  reverseString(str,len);
       System.out.println();
       if (originalString.equals(rev)) {
           System.out.println("The String "+originalString+" is Palindrome");
       }else{
           System.out.println("The String "+originalString+" is not Palindrome");
       }
        
        
    }
    
    public static String reverseString(String str, int len){
        String rev = "";
        System.out.print("Original String: ");
        for(int i = 0;i<len;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.print("Reverse String: ");
        for(int i=len-1;i>=0;i--){
            rev += str.charAt(i);
            System.out.print(str.charAt(i));
        }
        return rev;
    }
}
