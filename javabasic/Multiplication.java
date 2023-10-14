package com.javabasic;

public class Multiplication {
	static int a;
	static int b;
public Multiplication(int x) {
	a=x;
}
	public static void main(String[] args) {
		Multiplication m=new Multiplication(3);
		for(int i=1;i<=10;i++) {
			b=a*i;
			System.out.println(b);
		}
	}

}
