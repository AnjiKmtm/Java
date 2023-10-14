package com.java.Interfaces;

public class Interface {
	public static void main(String[] args) {
		int a=60;
	Demo3 d=new Demo3();
	d.show();
	d.mirror();
	d.display();
	System.out.println(a);
	System.out.println(demo1.a);
	}

}
interface demo1{
	int a=20;
	void show();
	void display();
}
abstract class demo2 implements demo1{
	int a=30;
	abstract void mirror();
	public void show() {
		System.out.println("havi");
	}
}
class Demo3 extends demo2{
	public void display() {
		System.out.println("display");
	}
		public void mirror() {
			System.out.println("mirror");
		}
	}

	
	

