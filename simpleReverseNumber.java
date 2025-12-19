
import java.util.*;
class simpleReverseNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       int num = sc.nextInt();
       int originalNUmbaer = num;
       int reverse = 0;
       
       while(num!=0){
          int digit = num%10;
          reverse  =  reverse*10+digit;
          num= num/10;
       }
       System.out.println("The Original Number is: "+originalNUmbaer);
       System.out.println("The Reverse Numebr is: "+reverse);
       sc.close();
    }
}
