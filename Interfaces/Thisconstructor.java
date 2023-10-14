package com.java.Interfaces;

public class Thisconstructor {

	    public int x;
		public Thisconstructor(int x){
	
		this.x=x;
		System.out.println(x);
		}
		public Thisconstructor() {
		this(5);
		System.out.println("this");
	}
		void show() {
			System.out.println("hii");
		}
	public static void main(String[] args) {
		Thisconstructor t=new Thisconstructor();
		
	}
}


	