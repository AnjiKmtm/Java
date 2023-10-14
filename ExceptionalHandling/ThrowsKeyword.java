package com.java.ExceptionalHandling;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsKeyword {
	public static void main(String[] args) throws  InterruptedException, IOException {
	FileWriter f=new FileWriter("password.txt");
	
	System.out.println("hi");
	Thread.sleep(5000);
	System.out.println("hello");
	}
}
