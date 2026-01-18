package com.practiceSet;
interface myFunction{
	
	int add(int x, int y);
	
}
public class LambdaExample {
   public static void main(String[] args) {
	   myFunction addition = (x,y)->(x+y);
	   int result = addition.add(12, 14);
	   System.out.println(result);
	   int result2= addition.add(14, 12);
	   System.out.println(result2);
}
}
