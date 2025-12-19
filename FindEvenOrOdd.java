// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FindEvenOrOdd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       int num = sc.nextInt();
       System.out.println(num);
       
       if(num%2==0){
           System.out.println("The Number is even: "+num);
       }else{
           System.out.println("The Number is Odd: "+num);
       }
        sc.close();
    }
}
