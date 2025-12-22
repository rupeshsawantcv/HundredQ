// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(isPrime(num)){
            System.out.print("The number is prime");
        }else{
            System.out.print("The number is not prime");
        }
        
    }
    public static boolean isPrime(int num){
        int n = num;
        boolean varIsPrime =  true;
        if(num<=1){
           return true;
            
        }
        for(int i = 2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
}
