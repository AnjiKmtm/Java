package com.java.ExceptionalHandling;

public class ReturnStatment {
public static void main(String[] args) {
	Return r=new Return();
	System.out.println(r.divideNumbers());
}
}
class Return{
	public int divideNumbers() {
		int a=10,b=0;
		try {
			return a/b;
		}catch(ArithmeticException e) {
			return 0;
		}finally {
			return 1;
		}
	}
}