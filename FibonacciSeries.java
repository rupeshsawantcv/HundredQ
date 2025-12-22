
import java.util.*;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int start= 0;
        int second = 1;
        System.out.print(start+" "+second+" ");
        for(int i = 3; i<=num;i++){
            int next = start+second;
            start = second;
            second = next;
            System.out.print(next+" ");
            
        }
        System.out.println("\nFibonacci series using recursion:");
        for (int i = 0; i < num; i++) {
            System.out.print(usingRecursion(i) + " ");
        }
    }
    
    public static int usingRecursion(int num){
        if (num == 0) return 0;  // base case
        if (num == 1) return 1;  // base case
        return usingRecursion(num - 1) + usingRecursion(num - 2);
    }
}
