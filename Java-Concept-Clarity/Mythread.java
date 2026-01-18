package com.practiceSet;
class MySecondThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Mythread extends Thread{
	
	public void run() {
		System.out.println("Thread is running....");
		
		currentThread().setName("Rupesh");
		System.out.println(currentThread().getName()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mythread t = new Mythread();
		t.start();
		System.out.println(t.currentThread().getName());
		

	}

}
