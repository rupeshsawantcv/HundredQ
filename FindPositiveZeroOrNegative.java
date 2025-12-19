
import java.util.*;
class FindPositiveZeroOrNegative {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       int num = sc.nextInt();
      
       if(num==0){
           System.out.println("The Number is zero");
       }else{
           System.out.println(num>0?"The Number is Positive" : "The Number is Negative");
       }
       sc.close();
    }
}
