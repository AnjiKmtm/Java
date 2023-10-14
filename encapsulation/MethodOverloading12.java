package com.javabasic.encapsulation;

class MethodOverloading{

	public void show() {
		System.out.println("hii");
	}

}
class MethodOverloading12 extends MethodOverloading{
	@Override
	public void show() {
		System.out.println("hiiiiii");
	}
public static void main(String[] args) {
	MethodOverloading12 m=new MethodOverloading12();
	m.show();

}
}
