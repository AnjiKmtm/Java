package com.javabasic.encapsulation;

import java.util.Scanner;

class Verification {
	{
		System.out.println("welcome to Axis bank");
		System.out.println("pls insert your card");
		System.out.println("enter your pin number");

	}
}

class block {

	static{
		System.out.println("select options");
		System.out.println("1-Balance enquiry");
		System.out.println("2-withdraw");
		System.out.println("3-deposit");
		System.out.println("4-pin change");
	}

}
class pinNotmatched extends RuntimeException{
	pinNotmatched(String s){
		super(s);
	}
}

class Variables {
	private long withdraw;
	private long balance = 40000;
	private long deposit;
	private long pin = 1234;

	public long getPin() {
		return pin;

	}

	public long getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(long withdraw) {
		this.withdraw = withdraw;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long getDeposit() {
		return deposit;
	}

	public void setDeposit(long deposit) {
		this.deposit = deposit;
	}

}

class Operations {
	Variables v = new Variables();

	public void balanceEnquiry() {

		System.out.println(" " + v.getBalance());
	}

	public void withdraw() {
		System.out.println("enter the amount");
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		if (amount <= v.getBalance()) {
			long b = v.getBalance() - amount;
		
			System.out.println("pls collect your money");
			System.out.println("the remaining balance is " + b);
		} else {
			System.out.println("insuffient funds in the account");
		}
	}

	public void deposit() {
		System.out.println("ennter the amount do u want to add");
		Scanner sc = new Scanner(System.in);
		long amount = sc.nextLong();
		long c = v.getBalance() + amount;
		System.out.println("the balance is" + c);
	}

	public void pinchange() {
		System.out.println("confirm the pin");
		Scanner sc = new Scanner(System.in);
		long pin = sc.nextLong();
		if (pin == v.getPin()) {
			System.out.println("enter new pin");
			long pin1 = sc.nextLong();
			System.out.println("confirm the new pin");
			long pin2 = sc.nextLong();
			if (pin1 == pin2) {
				System.out.println("your password is changed sucessfully");
			} else {
				System.out.println("not matched.try one more time");
			}
		} else {
			System.out.println("pin is not matched");
		}

	}
}

public class AtmFunctions {
	public static void main(String[] args) {

		Operations o = new Operations();
		Variables s = new Variables();
		Verification v = new Verification();
		Scanner sc = new Scanner(System.in);
		int pinentered = sc.nextInt();
		
		if (pinentered == s.getPin()) {
			block b = new block();
			System.out.println("enter your choice");
		} else {
			throw new pinNotmatched("pin is not matched checkonce");
		}
		int a = sc.nextInt();
		if (a == 1) {
			o.balanceEnquiry();
		} else if (a == 2) {
			o.withdraw();
		} else if (a == 3) {
			o.deposit();
		} else if (a == 4) {
			o.pinchange();
		} else {
			System.out.println("entered the wrong choice");
			System.out.println("pls select correct one");
		}
	}
}
