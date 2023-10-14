package com.Assasement;


	class ABC
	{
	    String myMethod(String s)
	    {
	        return s+s;
	    }
	}
	 
	class PQR extends ABC
	{
	    String myMethod(String s, double d)
	    {
	        return myMethod(s+d);
	    }
	}
	 
	class XYZ extends PQR
	{
	    String myMethod(String s, double d, int i)
	    {
	        return myMethod(s, d+i);
	    }
	}
	 
	public class main
	{
	    public static void main(String[] args)
	    {
	        XYZ xyz = new XYZ();
	 
	        System.out.println(xyz.myMethod("JAVA", 23.23, 111));
	    }
	}

