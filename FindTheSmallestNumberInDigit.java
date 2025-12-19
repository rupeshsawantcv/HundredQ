
import java.util.*;
class FindTheSmallestNumberInDigit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       int num = sc.nextInt();
       int originalNUmbaer = num;
       int smallElement = 9;
       
       
       while(num!=0){
          int digit = num%10;
         if(digit<smallElement){
             smallElement=digit;
         }
         
          num= num/10;
       }
       System.out.println("The Original Number is: "+originalNUmbaer);
       System.out.println("The Smallest  Numebr is: "+smallElement);
       sc.close();
    }
}
