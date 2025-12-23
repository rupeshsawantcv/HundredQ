// Write a program to reverse a given string.
import java.util.*;
class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        
        int len = str.length();
        System.out.println("The Length of String is: "+len);
        
        reverseString(str,len);
    }
    
    public static void reverseString(String str, int len){
        
        System.out.print("Original String: ");
        for(int i = 0;i<len;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.print("Reverse String: ");
        for(int i=len-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
