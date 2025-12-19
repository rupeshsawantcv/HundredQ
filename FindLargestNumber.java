
import java.util.*;
class FindLargestNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       int num = sc.nextInt();
       int originalNUmbaer = num;
       int largestNumber = 0;
       
       
       while(num!=0){
          int digit = num%10;
         if(digit>largestNumber){
             largestNumber=digit;
         }
          num= num/10;
       }
       System.out.println("The Original Number is: "+originalNUmbaer);
       System.out.println("The Largest  Numebr is: "+largestNumber);
       sc.close();
    }
}
