
import java.util.*;

class FindPrimeUpTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Prime numbers between 0 to "+num+" as follows: ");
        for(int i = 0; i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
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
