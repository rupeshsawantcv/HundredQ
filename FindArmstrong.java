//Write a program to check whether a number is an Armstrong number.
import java.util.*;
class FindArmstrong {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      int num = sc.nextInt();
       
       ifArmstrong(num);
    }
    public static void ifArmstrong(int num){
        int originalNumber = num;
        int OriginalNum = num;
        int digit = 0;
        while(num!=0){
            digit++;
            num=num/10;
        }
        // System.out.println("original Number: "+originalNumber);
        // System.out.println("Their total digits: "+digit);
        
        int sum = 0;
        while(originalNumber!=0){
            int lastDigit = originalNumber%10;
            sum+=Math.pow(lastDigit,digit);
            originalNumber=originalNumber/10;
            
        }
        // System.out.println("Sum for armstrong "+sum);
        if(OriginalNum==sum){
            System.out.println("The "+OriginalNum+" is Armstrong");
        }else{
            System.out.println("The "+OriginalNum+" is not Armstrong");
        }
      
        
    }
}
