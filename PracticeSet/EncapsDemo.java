package com.Try;

import java.util.Scanner;

class bankAccout{
	private String Name;
	private int Number;
	private int Balance;
	private int pin;


public bankAccout(String name, int num, int balance, int pin) {
	this.Name=name;
	this.Number=num;
	this.Balance=balance;
	this.pin=pin;
	}
public String AccountInfo() {
	return "Accout holder Name: "+Name +" \nAcount Number: " +Number;
}
     public String GetBalance(int EnteredPin) {
		if(this.pin==EnteredPin) {
			System.out.println("Balance is : "+Balance);
		}else {
			System.out.println("Wrong pin, Access Denied!");
		}
		return "Thank you";
    	 
     }


}

public class EncapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		bankAccout MyAccount = new bankAccout("Rupesh Sawant",9778, 10000, 1816);
		System.out.println(MyAccount.AccountInfo());
		System.out.println("Enter pin to get Balance: ");
		int EnteredPin = Sc.nextInt();
		System.out.println(MyAccount.GetBalance(EnteredPin));
		
		
		

	}

}
