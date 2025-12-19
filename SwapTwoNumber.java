
//Write a program to swap two numbers without using a third variable.
class SwapTwoNumber {
    public static void main(String[] args) {
        int a= 10;
        int b=12;
        
        
        System.out.println("Befor swap: a = "+a+" and b = "+b);
      
       a=a+b;  ///a=22
       b=a-b; /// b=10
       a=a-b;  //a=12
       
    
        System.out.println("After swap: a = "+a+" and b = "+b);
    }
}
