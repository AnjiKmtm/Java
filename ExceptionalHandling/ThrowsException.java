package com.java.ExceptionalHandling;

public class ThrowsException {
	public static void num() throws InterruptedException{
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) {
		
		try {
			num();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
