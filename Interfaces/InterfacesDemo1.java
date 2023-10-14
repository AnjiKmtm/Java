package com.java.Interfaces;

public class InterfacesDemo1 {
	public static void main(String[] args) {
	demo6 d=new demo6();

	System.out.println(d.a);
	}
}
interface demo4{
	int a=20;
	void show();
}
interface demo5 extends demo4 {
	
	void display();
}
class demo6 implements demo5,demo4{
	public void display() {
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}